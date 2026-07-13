package com.my.javapractise.array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        //using while loop
        System.out.println();
        System.out.println("Reversed Array using while loop:");
        int i = n - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
    }
}
