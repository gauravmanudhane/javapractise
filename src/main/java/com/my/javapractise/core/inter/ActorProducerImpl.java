package com.my.javapractise.core.inter;

public class ActorProducerImpl implements Actor, Producer {
    public void perform() {
        System.out.println("Acting in a movie");
    }
    public void invest() {
        System.out.println("Investing in production");
    }
}
