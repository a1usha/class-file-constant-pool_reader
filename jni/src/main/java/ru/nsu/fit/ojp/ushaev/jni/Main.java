package ru.nsu.fit.ojp.ushaev.jni;

public class Main {

    public static void main(String[] args) {
        SystemInfo.getCpuInfo().forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
