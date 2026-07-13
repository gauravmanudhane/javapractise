package com.my.javapractise.ds.patterns.arrays.slidingwindow;

public class MaximumAvgSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(arr, k));
    }

    private static double findMaxAverage(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Array cannot be null and its length must be at least k");
        }

        double maxAvg = Double.NEGATIVE_INFINITY;
        double currentSum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxAvg = Math.max(maxAvg, currentSum / k);

        // Slide the window over the array
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k]; // Add next element and remove the first element of the previous window
            maxAvg = Math.max(maxAvg, currentSum / k); // Update max average if needed
        }

        return maxAvg;
    }
}
