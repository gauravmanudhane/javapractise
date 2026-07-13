package com.my.javapractise.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestHCL {
    public static void main(String[] args) {
        //"inds1", "outs2",sioi3","road4","gass5"

        String p[] = {"inds1", "outs2", "sioi3", "road4", "gass5"};//


        IntStream.range(0,p.length).
                mapToObj(c -> p[c].charAt(3)).
                filter(c -> Character.isLetter('s')).
                forEach(System.out::println);

        

    }
}
