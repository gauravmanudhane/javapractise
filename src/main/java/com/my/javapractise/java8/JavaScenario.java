package com.my.javapractise.java8;

import java.util.*;
import java.util.stream.Stream;

public class JavaScenario {
    public static void main(String[] args) {
        //String join method is used to join multiple strings with a specified delimiter.
        // returns a single string that is the concatenation of the input strings, separated by the delimiter.
        String joinString1= String.join("-","welcome","to","javaworld");
        System.out.println(joinString1);

        //add prefix and suffix to string using StringJoiner
        StringJoiner stringJoiner = new StringJoiner(",", "#", "#");
        stringJoiner.add("Interview");
        stringJoiner.add("Questions");
        stringJoiner.add("Answers");
        System.out.println("String after adding # in suffix and prefix :"+ stringJoiner);

        //print random numbers using Java 8 Stream API using Random class
        Random random = new Random();
        random.ints().limit(4).forEach(System.out::println);

        //iterate through a list of strings using Java 8 Stream API
        //old way
        List<String> sampleList= new ArrayList<>();
        sampleList.add("Hello");
        sampleList.add("GoodDay");
        //modern way using Arrays.asList() method
        List<String> listOfstr = Arrays.asList("Hello","GoodDay");
        listOfstr.stream().forEach(System.out::println);

        //find the minimum number from a list of integers using Java 8 Stream API
       int min= Stream.of(1,2,2,4,5).min(Comparator.comparingInt(Integer::valueOf)).get();
        System.out.println("The Minimum number is: " + min);

        // find the minimum number from an array of integers using Java 8 Stream API
        int arr[] = {0,1,2,3,4,5};
        int min1 = Arrays.stream(arr).min().getAsInt();
        System.out.println(min1);

        //  find the maximum number from a list of integers using Java 8 Stream API
        Integer max = Stream.of(1, 2, 3, 4, 5, 6,7)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The Maximum number is: " + max);

        // find the maximum number from an array of integers using Java 8 Stream API
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int max1 = Arrays.stream(arr1).max().getAsInt();
        System.out.println("The Maximum number is: " + max1);

        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        stringList.stream().filter(s -> s.length() >=4).forEach(System.out::println);
        stringList.stream().filter(s -> s.length() >=4).map(String::toUpperCase).forEach(System.out::println);
        long count=stringList.stream().filter(s -> s.length() >=4).count();
        System.out.println("count is: " + count);
    }
}
