package com.my.javapractise.thread;

public class ByImplementingRunnable implements Runnable{

    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        ByImplementingRunnable instance=new ByImplementingRunnable();
        Thread thr=new Thread(instance);
        thr.start();
    }
}
