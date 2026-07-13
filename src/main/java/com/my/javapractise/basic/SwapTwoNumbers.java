package com.my.javapractise.basic;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        a = a + b; // a now holds the sum of a and b //5+10=15
        b = a - b; // b now holds the original value of a //15-10=5
        a = a - b; // a now holds the original value of b //15-5=10
    }
}
