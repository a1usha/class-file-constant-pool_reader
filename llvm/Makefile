all: cpuinfo.bc Main.class

cpuinfo.bc: cpuinfo.c
	clang -g -O1 -c -emit-llvm --target=x86_64-unknown-linux-gnu -I$$GRAALVM_HOME/languages/llvm/include cpuinfo.c

Main.class: Main.java
	javac Main.java

clean:
	rm cpuinfo.bc; rm Main.class