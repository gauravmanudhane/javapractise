package com.my.javapractise.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ModernWay {

    private static AtomicInteger count;

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello from a thread!");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
        };

        Thread thread = new Thread(task,"MyThread");
        thread.start();
    }
}
