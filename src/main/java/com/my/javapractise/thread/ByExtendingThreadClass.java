package com.my.javapractise.thread;

public class ByExtendingThreadClass extends Thread{

    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        ByExtendingThreadClass instance=new ByExtendingThreadClass();
        instance.start();
    }
}
