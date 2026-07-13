package com.my.javapractise.java8.fi;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', dept='%s', salary=%.2f}", name, department, salary);
    }
}
