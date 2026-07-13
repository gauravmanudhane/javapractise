package com.my.javapractise.characters;

public class ReverseCharacters {
    public static void main(String[] args) {
        Character[] arr = {'g', 'a', 'u', 'r', 'a', 'v'};
        int left = 0;
        int right = arr.length - 1;
        //reverse the array
        while (left < right) {
            Character temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reverse Characters::");
        for (Character c : arr) {
            System.out.print(c + " ");
        }
    }
}
