package com.my.javapractise.java8.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {

        List<Integer> inputList= Arrays.asList(1,2,3,4,5,5,6,6,7,8,9,9,10);

        /*Imperative Approach */
        List<Integer> imperativeList=new ArrayList<>();
        for(Integer list:inputList){
            if(!imperativeList.contains(list)){
                imperativeList.add(list);
            }
        }
       System.out.println("Imperative way::"+imperativeList);

        /*Declarative Approach */
        List<Integer> declarativeList=inputList.stream().distinct().collect(Collectors.toList());
        System.out.println("Declarative way::"+declarativeList);
    }

       String input="Gaurav";


}
