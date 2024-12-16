package com.my.javapractise.string;

public class ReverseString {
    public static void main(String[] args) {
        String input="Gaurav";
        StringBuilder s=new StringBuilder(input);
        System.out.println("Reverse String using in build fun::"+ s.reverse());
        System.out.println("Reverse String::"+reverseOrder(input));

    }

    //O(n)
    private static String reverseOrder(String input){
        String output="";
        for(int i=input.length()-1; i>=0;i--)
            output +=input.charAt(i);
        return output;
    }

}
