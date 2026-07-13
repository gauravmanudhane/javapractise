package com.my.javapractise.array;

public class MergeInterval {
    public static void main(String[] args) {
      System.out.println("Merge Intervals");

     int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
     int[][] merged = merge(intervals);
     for (int[] interval : merged) {
         System.out.println("[" + interval[0] + "," + interval[1] + "]");
     }
    }

    private static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Sort intervals based on the start time
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        java.util.List<int[]> merged = new java.util.ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) { // Overlapping intervals
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else { // Non-overlapping interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}

