package com.my.javapractise.string;

public class StringBasics {
    public static void main(String[] args) {
        String s1= "Hello"; //string constant pool
        s1.concat("World"); // this line ignore by java
        System.out.println("immutable is the...."+ s1);

        String s2= s1.concat(" World"); //Heap memory
        System.out.println("s2 is the...."+ s2);

        String s3= s1.concat(" World").intern(); //constant pool
        System.out.println("s3 is the...."+ s3);
        System.out.println(s2==s3); //false

        String s4= new String("Hello World"); //Heap mem create new obj
        System.out.println(s2==s4); //false

        String s5= "Hello World"; //constant pool
        System.out.println(s3==s5); //true

        String str1 = "InterviewBit";
        String str2 = "InterviewBit";

        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2)); //true

    }
}
