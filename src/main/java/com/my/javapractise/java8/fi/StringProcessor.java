package com.my.javapractise.java8.fi;

@FunctionalInterface
public interface StringProcessor {

    String process(String input);

    // Default method — allowed in functional interfaces
    default StringProcessor andThen(StringProcessor next) {
        return input -> next.process(this.process(input));
    }

    // Static method — also allowed
    static StringProcessor identity() {
        return input -> input;
    }
}
