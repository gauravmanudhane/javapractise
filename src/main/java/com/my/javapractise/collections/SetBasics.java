package com.my.javapractise.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBasics {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Gaurav");
        set.add("Gaurav");
        set.add("GAURAV");
        set.add("Gunjan");
        System.out.println(set);

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Ravi");
        treeSet.add("Ajay");
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        System.out.println(treeSet);

    }
}
