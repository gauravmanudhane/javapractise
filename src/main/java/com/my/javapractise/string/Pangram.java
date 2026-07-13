package com.my.javapractise.string;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
    }
    private static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPangramUsingSet(String str) {
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                set.add(ch);
            }
        }
        return set.size() == 26;
    }

    private static boolean isPangramSet(String str){
        str=str.toLowerCase();
        Set<Character> set=new HashSet<>();
        for(char ch:str.toCharArray()){
            if(ch >='a' && ch <='z'){
                set.add(ch);
            }
        }
        return set.size()==26;
    }
}
