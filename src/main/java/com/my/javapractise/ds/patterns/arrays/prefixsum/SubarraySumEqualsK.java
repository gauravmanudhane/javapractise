package com.my.javapractise.ds.patterns.arrays.prefixsum;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1};
        int k = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
