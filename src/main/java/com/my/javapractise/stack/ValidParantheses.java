package com.my.javapractise.stack;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s));
        String s1 = "({[}])";
        System.out.println(isValid(s1));
    }

    private static boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                      if((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
