package com.my.javapractise.core;

public class DeepCopy {
    int length = 5;
    int breadth = 3;
}

class Test{
    public static void main(String[] args) {
        DeepCopy obj1 = new DeepCopy();
        //Shallow Copy
        DeepCopy obj2 = new DeepCopy();

        //DeepCopy obj2 = obj1.clone();

        obj2.length = obj1.length;
        obj2.breadth = obj1.breadth;

        System.out.println(" Before Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

        //Changing the values for object1.
        obj1.length = 10;
        obj1.breadth = 20;

        System.out.println("\n After Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);
    }
}
