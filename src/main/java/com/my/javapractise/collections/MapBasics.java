package com.my.javapractise.collections;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {
    public static void main(String[] args) {
     Map<Integer,String> hashmap=new HashMap<>();
        hashmap.put(100,"Gaurav");
        hashmap.put(100,"Gunjan");
        System.out.println(hashmap);
    }
}
