import java.io.*;
import org.graalvm.polyglot.*;

class Main {
    public static void main(String[] args) throws IOException {
        Context polyglot = Context.newBuilder().
        		               allowAllAccess(true).build();
        File file = new File("cpuinfo.bc");
        Source source = Source.newBuilder("llvm", file).build();
        Value lib = polyglot.eval(source);
        Value fn = lib.getMember("cpuinfo");
        fn.executeVoid();
    }
}