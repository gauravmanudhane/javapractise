package com.my.javapractise.map;

import java.util.HashMap;
import java.util.Map;

public class MapScenario {
    public static void main(String[] args) {

        Map<Employee, String> map= new HashMap<>();
        Employee emp1 = new Employee(101, "John");
        map.put(emp1, "Manager");
        emp1.setName("john1");

        map.put(emp1, "Manager1");

        Employee emp2 = new Employee(101, "John");

        System.out.println(map.get(emp2)); // Output: null

        System.out.println(map.get(emp1)); // Output: Manager


    }
}
