package com.my.javapractise.core.abst;

public class Test {
    public static void main(String[] args) {
        // Abstract class reference can hold the object of its subclass
        /*A a = new B();
        a.m1(); // Calls the overridden method in class B*/

        Car myCar = new Sedan();
        myCar.accelerate();
        myCar.changeGears();
        myCar.changeGears2();

        System.out.println("Using Sedan reference***********:");
        Sedan mySedan = new Sedan();
        mySedan.accelerate();
        mySedan.changeGears();


    }
}
