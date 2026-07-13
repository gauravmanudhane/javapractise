package com.my.javapractise.string;

public class StringRotation {
    public static String isRotation(String a, String b) {

        if (a.length() != b.length()) {
            return "false";
        }
        String doubled = a + a;

        if (doubled.contains(b)) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        System.out.println(isRotation("ABCD", "CDAB"));
    }
}
