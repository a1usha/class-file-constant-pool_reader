package ru.nsu.fit.ojp.ushaev.jni;

import java.util.Map;

public class SystemInfo {
    static {
        System.loadLibrary("cpuinfo");
    }

    public static native Map<String, String> getCpuInfo();
}
