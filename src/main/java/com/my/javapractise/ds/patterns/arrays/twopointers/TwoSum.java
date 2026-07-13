package com.my.javapractise.ds.patterns.arrays.twopointers;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 10;

        //brute force approach- target (i.e. arr[i] + arr[j] = target). Time complexity: O(n^2) Space complexity: O(1)
        int[] result = twoSumBruteForce(arr, target);
        if (result != null) {
            System.out.println("Indices with brute force: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }

        // Note: The two-pointer approach assumes that the input array is sorted. If the array is not sorted, you would need to sort it first,
        // which would add O(n log n) time complexity to the overall solution.
        //two pointer approach - target (i.e. arr[left] + arr[right] = target). Time complexity: O(n) Space complexity: O(1)
        int[] resultTwoPointer = twoSum(arr, target);
        if (resultTwoPointer != null) {
            System.out.println("Indices with two pointers: " + resultTwoPointer[0] + ", " + resultTwoPointer[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }

        //HashMap approach - target (i.e. arr[i] + arr[j] = target). Time complexity: O(n) Space complexity: O(n)
        int[] resultHashMap = twoSumHashMap(arr, target);
        if (resultHashMap != null) {
            System.out.println("Indices with HashMap: " + resultHashMap[0] + ", " + resultHashMap[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }

    public static int[] twoSumBruteForce(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return null; // Return null if no two numbers add up to the target
    }

    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right}; // Return the indices of the two numbers
            } else if (sum < target) {
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }
        return null; // Return null if no two numbers add up to the target
    }

    public static int[] twoSumHashMap(int[] arr, int target) {

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i]; //10-2=8

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return the indices of the two numbers
            }

            map.put(arr[i], i); // Store the number and its index in the HashMap
        }
        return null; // Return null if no two numbers add up to the target
    }
}
