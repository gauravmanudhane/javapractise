package com.my.javapractise.core.abst;

abstract class Car {

    public Car() {
        System.out.println("Car constructor called");
    }
    public void accelerate() {
        System.out.println("Accelerating...");
    }
    public abstract void changeGears();
    public abstract void changeGears2();
}
