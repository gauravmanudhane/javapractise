package com.my.javapractise.array;

import java.util.Map;
import java.util.TreeMap;

public class DuplicateCount {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,3,4,4,5,6,6,6,6,7,8,9,9};
        Map<Integer,Integer> map=new TreeMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
