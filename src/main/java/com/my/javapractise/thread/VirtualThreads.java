/*
package com.my.javapractise.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreads {
    public static void main(String[] args) {
        System.out.println("Initial thread count: " + Thread.activeCount());
        demoWithThreadOfVirtual();
        System.out.println("After demoWithThreadOfVirtual: " + Thread.activeCount());
        demoWithExecutorService();
        System.out.println("After demoWithExecutorService: " + Thread.activeCount());
    }

    private static void demoWithThreadOfVirtual() {
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in virtual thread: " + Thread.currentThread());
        });
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void demoWithExecutorService() {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Running in virtual thread via executor: " + Thread.currentThread());
                });
            }
        }
    }

    //by using virtual threads we can create large number of threads without worrying about the overhead of creating and managing them.
    // Virtual threads are lightweight and can be created in large numbers without consuming significant system resources.
    // This allows for better scalability and performance in applications that require a large number of concurrent tasks.
    
}
*/
