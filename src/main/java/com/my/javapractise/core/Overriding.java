package com.my.javapractise.core;

public class Overriding {
    public static void main(String[] args) {
        Athlete at=new Athlete();
         int speed=at.walk(40,20);
         System.out.println(speed);

        HumanBeing h=new HumanBeing();
        int speed1=h.walk(40,20);
        System.out.println(speed1);

        HumanBeing at1=new Athlete();
        int speed2=at1.walk(40,20);
        System.out.println(speed2);
    }
}

class HumanBeing {
    public int walk (int distance, int time) {
        System.out.println("main method called");
        int speed = distance / time;
        return speed;
    }
}
class Athlete extends HumanBeing {
    public int walk(int distance, int time) {
        System.out.println("ovverriden method called");
        int speed = distance / time;
        speed = speed * 2;
        return speed;
    }
}
