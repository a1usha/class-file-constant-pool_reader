package ru.nsu.fit.ojp.ushaev.ojp_3;

import javassist.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class MyJavaAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello from Java Agent!");

        // Transformer to modify bytecode using Javassist
        inst.addTransformer(new MyTransformer());

        // Shutdown Hook to print number of loaded classes in the end of the program
        Runtime.getRuntime().addShutdownHook(new Thread(() ->
                System.out.println("Number of loaded classes: " + inst.getAllLoadedClasses().length)));
    }

    static class MyTransformer implements ClassFileTransformer {

        @Override
        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                                ProtectionDomain protectionDomain, byte[] classfileBuffer) {

            if (className.equals("TransactionProcessor")) {
                try {

                    ClassPool cp = ClassPool.getDefault();
                    CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));

                    CtField min = CtField.make("private static float min;", cc);
                    CtField total = CtField.make("private static float total;", cc);
                    CtField max = CtField.make("private static float max;", cc);
                    CtField cnt = CtField.make("private static int cnt;", cc);
                    CtField tmpTimeMillis = CtField.make("private static long tmpTimeMillis;", cc);
                    CtField tmpTimeSec = CtField.make("private static float tmpTimeSec;", cc);

                    cc.addField(min, "1.1F");
                    cc.addField(total, "0F");
                    cc.addField(max, "-1F");
                    cc.addField(cnt, "0");
                    cc.addField(tmpTimeMillis, "0L");
                    cc.addField(tmpTimeSec, "0F");

                    // Modify processTransaction metod - add 99 to first argument
                    CtMethod mProcessTransaction = cc.getDeclaredMethod("processTransaction");
                    mProcessTransaction.insertBefore("{$1 += 99;}");
                    // Rename method to use it in proxy method with same name
                    mProcessTransaction.setName("tmp");

                    // Create new proxy method to measure min, avg and max execution time of processTransaction method
                    CtMethod proxyProcessTransaction = CtNewMethod.make(
                            "public void processTransaction(int txNum) throws Exception {" +
                                    "tmpTimeMillis = System.currentTimeMillis();" +
                                    "tmp(txNum);" +
                                    "tmpTimeSec = (System.currentTimeMillis() - tmpTimeMillis) / 1000F;" +
                                    "min = tmpTimeSec < min ? tmpTimeSec : min;" +
                                    "total += tmpTimeSec;" +
                                    "cnt += 1;" +
                                    "max = tmpTimeSec > max ? tmpTimeSec : max;" +
                                    "}", cc);
                    cc.addMethod(proxyProcessTransaction);

                    // Visit method main
                    CtMethod main = cc.getDeclaredMethod("main");
                    main.insertAfter("{System.out.println(\"Min: \" + min + \", Avg: \" + total/cnt + \", Max: \" + max);}");

                    // Get bytecode
                    byte[] modifiedClassfileBuffer = cc.toBytecode();
                    cc.detach();
                    return modifiedClassfileBuffer;

                } catch (IOException | NotFoundException | CannotCompileException e) {
                    e.printStackTrace();
                }
            }
            return classfileBuffer;
        }
    }
}
