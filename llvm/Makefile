all: cpuinfo.bc Main.class

cpuinfo.bc: cpuinfo.c
	clang -g -O1 -c -emit-llvm --target=x86_64-unknown-linux-gnu cpuinfo.c

Main.class: Main.java
	javac Main.java