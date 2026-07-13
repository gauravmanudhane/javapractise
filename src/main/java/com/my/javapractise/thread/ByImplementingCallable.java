package com.my.javapractise.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ByImplementingCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        ByImplementingCallable instance = new ByImplementingCallable();
       FutureTask<Integer> futureTask = new FutureTask<>(instance);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("Sum of first 10 natural numbers: " + futureTask.get());
    }

}
