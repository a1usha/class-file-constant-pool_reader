# Certain deadlock in Java
The program creates two locks and one custom implemented latch to synchronize two threads. Each thread closes the first lock and decrements the latch by one. As soon as the counter is reset, the threads try to close the second lock, but it has already been closed by another thread.

`Jstack` output for clarity:
```
$ jps

8788 Jps
4904 Main
6860 org.eclipse.equinox.launcher_1.6.100.v20201223-0822.jar

$ jstack 4904

...
Found one Java-level deadlock:
=============================
"Thread-0":
  waiting to lock monitor 0x000001f2d7529340 (object 0x0000000089ceb548, a java.lang.Object),
  which is held by "Thread-1"

"Thread-1":
  waiting to lock monitor 0x000001f2d7527340 (object 0x0000000089ceb538, a java.lang.Object),
  which is held by "Thread-0"

Java stack information for the threads listed above:
===================================================
"Thread-0":
        at Main.run(Main.java:26)
        - waiting to lock <0x0000000089ceb548> (a java.lang.Object)
        - locked <0x0000000089ceb538> (a java.lang.Object)
"Thread-1":
        at Main.run(Main.java:26)
        - waiting to lock <0x0000000089ceb538> (a java.lang.Object)
        - locked <0x0000000089ceb548> (a java.lang.Object)

Found 1 deadlock.
```