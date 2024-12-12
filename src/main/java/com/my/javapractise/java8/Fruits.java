package com.my.javapractise.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruits {
    private String name;
    private String color;
}

class Test{
    public static void main(String[] args) {

        List<Fruits> list=new ArrayList<>();
        list.add(new Fruits("Apple","Red"));
        list.add(new Fruits("Mango","Yellow"));
        list.add(new Fruits("Apple","Red"));
        list.add(new Fruits("Pear","Green"));
        list.add(new Fruits("Pear","Green"));
        list.add(new Fruits("Apple","Red"));

    }
}
