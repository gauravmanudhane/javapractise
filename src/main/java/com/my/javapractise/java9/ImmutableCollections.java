package com.my.javapractise.java9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableCollections {
    public static void main(String[] args) {
        //before Java 9
        List<String> spellList= new ArrayList<>();
        spellList.add("Expecto Patronum");
        spellList.add("Wingardium Leviosar");
        spellList.add("Avada KeDavara");
        spellList.add("Crucio");
        System.out.println(spellList);
        spellList.add("Imperio");
        System.out.println(spellList);

        // to make the list immutable before Java 9 we can use Collections.unmodifiableCollection() method
        Collection<String> readOnlyList = Collections.unmodifiableCollection(spellList);
        readOnlyList.add("lumos"); //runtime error as list is immutable

        // Java 9 onwards directly create immutable list using List.of() method
        List<String> immutableList = List.of("Harry Potter", "Hermoinie", "Ron Weasely", "Dumbledore", "Sirius Black", "Nagini");
        System.out.println(immutableList);
        immutableList.add("snape"); // runtime error as list is immutable

        // Similarly we can create immutable set and map using Set.of() and Map.of() methods respectively
        var list = java.util.List.of(1, 2, 3, 4, 5);
        System.out.println(list);

        var set = java.util.Set.of("A", "B", "C", "D");
        System.out.println(set);

        var map = java.util.Map.of(1, "One", 2, "Two", 3, "Three");
        System.out.println(map);
    }
}
