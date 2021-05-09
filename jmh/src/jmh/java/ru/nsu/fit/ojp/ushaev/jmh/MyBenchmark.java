package ru.nsu.fit.ojp.ushaev.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 3, time = 5)
@Measurement(iterations = 3)
@State(Scope.Benchmark)
public class MyBenchmark {

    private final String TRUE_TEST_STRING = "298374239";
    private final String FALSE_TEST_STRING = "not a number";

    private final NumCheckers numCheckers = new NumCheckers();

    @Benchmark
    public void testTrueException(Blackhole bh) {
        bh.consume(numCheckers.checkUsingException(TRUE_TEST_STRING));
    }

    @Benchmark
    public void testFalseException(Blackhole bh) {
        bh.consume(numCheckers.checkUsingException(FALSE_TEST_STRING));
    }

    @Benchmark
    public void testTrueRegexp(Blackhole bh) {
        bh.consume(numCheckers.checkUsingRegexp(TRUE_TEST_STRING));
    }

    @Benchmark
    public void testFalseRegexp(Blackhole bh) {
        bh.consume(numCheckers.checkUsingRegexp(FALSE_TEST_STRING));
    }

    @Benchmark
    public void testCompiledRegexp(Blackhole bh) {
        bh.consume(numCheckers.checkUsingCompiledRegexp(FALSE_TEST_STRING));
    }

    @Benchmark
    public void testTrueEveryChar(Blackhole bh) {
        bh.consume(numCheckers.checkEverySymbol(TRUE_TEST_STRING));
    }

    @Benchmark
    public void testFalseEveryChar(Blackhole bh) {
        bh.consume(numCheckers.checkEverySymbol(FALSE_TEST_STRING));
    }
}
