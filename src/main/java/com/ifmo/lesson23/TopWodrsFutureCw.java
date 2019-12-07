package com.ifmo.lesson23;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TopWodrsFutureCw {
    public static void main(String[] args) {
        int cpus = Runtime.getRuntime().availableProcessors();
        ExecutorService pool = Executors.newFixedThreadPool(cpus);

    }
}
