package com.MiniProject3.AlgorithmToolkit;

public class AnalysisUtil {
    public static long measure(Runnable algorithm) {
        long start = System.currentTimeMillis();
        algorithm.run();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
