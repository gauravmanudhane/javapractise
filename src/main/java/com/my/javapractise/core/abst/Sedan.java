package com.my.javapractise.core.abst;

public class Sedan extends Car {
    @Override
    public void changeGears() {
        System.out.println("Changing gears in Sedan");
    }

    @Override
    public void changeGears2() {
        System.out.println("Changing gears2 in Sedan");
    }
}
