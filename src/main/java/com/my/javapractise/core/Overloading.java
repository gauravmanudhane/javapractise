package com.my.javapractise.core;

public class Overloading {
    public int findarea (int l, int b) {
        int var1;
        var1 = l * b;
        return var1;
    }
    public int findarea (int l, int b, int h) {
        int var2;
        var2 = l * b * h;
        return var2;
    }
}
