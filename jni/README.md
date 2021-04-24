# Simple JNI bridge

The native C shared library reads the virtual file `/proc/cpuinfo` from the context of a java program

To run the program use `gradle run`, or you can package the jar using `gradle jar`. It will automatically compile module `libcpuinfo.so` for `arm` and `x86-64`.

Usage example (using `gradle jar`):
```
$ gradle jar
$ java -jar -Djava.library.path=./build/libs/cpuinfo/shared/x64/ build/libs/jni-1.0-SNAPSHOT.jar

cpu cores: 2
model name: Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz
cache size: 256 KB
cpu MHz: 2400.000
```

Usage example on Raspberry Pi 4 (using `gradle run`):
```
$ gradle run

...
model name: ARMv7 Processor rev 3 (v7l)
```