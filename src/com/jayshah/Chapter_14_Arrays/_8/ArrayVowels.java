package com.jayshah.Chapter_14_Arrays._8;

import java.util.Scanner;

public class ArrayVowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i <= 9; i++) {
            System.out.println("Enter word " + (i + 1));
            arr[i] = s.next();
        }

        System.out.println("=================================================");

        String token;
        for (int i = 0; i <= 9; i++) {
            token = arr[i];
            char c1 = token.charAt(0);
            char c2 = token.charAt(token.length() - 1);
            if ((c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') && (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u')) {
                System.out.println(arr[i]);
            }
        }
    }
}
