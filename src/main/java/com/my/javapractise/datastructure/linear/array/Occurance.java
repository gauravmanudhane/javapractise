package com.my.javapractise.datastructure.linear.array;

import java.util.Arrays;

public class Occurance {

    public static void main(String[] args) {
        //find input how many times occur in given array
        int[] arr ={1,2,2,2,2,3,4};
        int input=2;
        System.out.print("Number of occurances::::"+occurances(arr,input));
        System.out.print("Number of occurances Using java8::::"+occurancesJava8(arr,input));
        System.out.print("Number of occurances Using binarySearch::::"+occurancesBinarySearch(arr,input));

    }

    // Time- O(n) // Space - O(1)
    private static Integer occurances(int[] arr,int input){
        int count=0;
        for(int i:arr){
            if(i==input)
                count++;
        }
        return count;
    }

    // Time- O(n) // Space - O(1)
    private static Integer occurancesJava8(int[] arr,int input){
        return (int) Arrays.stream(arr).filter(n ->n==input).count();
    }

    //Need to check below solution --> O(log n)
    private static Integer occurancesBinarySearch(int[] arr,int input){
        int index=Arrays.binarySearch(arr,input);
        if(index >=0){
            return index;
        }else{
            return 0;
        }
    }



}
