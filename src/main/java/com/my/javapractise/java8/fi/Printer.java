package com.my.javapractise.java8.fi;

@FunctionalInterface
public interface Printer<T> {
    void print(T t);
}
