package com.my.javapractise.ds.patterns.arrays.prefixsum;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];

        // Calculate prefix sum  SUM[I,J]= P[J] - P[I-1]
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i : prefixSum) {
            System.out.print(i + " ");
        }
    }
}
