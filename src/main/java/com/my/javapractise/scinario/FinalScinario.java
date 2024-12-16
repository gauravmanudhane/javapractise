package com.my.javapractise.scinario;

public class FinalScinario {
    public static void main(String[] args) {
        final int i;
        i = 20;
        int j = i+20;
        //i = j+30; // variable i might already have been initialized
        System.out.println(i + " " + j);
    }
}
