package com.my.javapractise.core;

public class ShallowCopy {
    int length = 5;
    int breadth = 3;
}

class ShallowTest{
    public static void main(String[] args) {
        ShallowCopy obj1 = new ShallowCopy();
        //Shallow Copy
        ShallowCopy obj2 = obj1;

        System.out.println(" Before Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

        //Changing the values for object1.
        obj1.length = 10;
        obj1.breadth = 20;

        System.out.println("\n After Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

    }
}
