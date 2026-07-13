package com.my.javapractise.java8.fi;

@FunctionalInterface
public interface MyFunctionalInterface {

    int operation(int a, int b);  // single abstract method

    default void printResult(int result) {
        System.out.println("Result is: " + result);
    }

    static void showInfo() {
        System.out.println("This is a static method in functional interface");
    }

}
