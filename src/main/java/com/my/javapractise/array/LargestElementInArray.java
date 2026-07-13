package com.my.javapractise.array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {9,3, 5, 7, 2, 8, 1};
        int largest = findLargest(arr);
        System.out.println("Largest element in the array: " + largest);
    }

    private static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) { // Compare current element with largest
                largest = arr[i];
            }
        }
        return largest;
    }
}
