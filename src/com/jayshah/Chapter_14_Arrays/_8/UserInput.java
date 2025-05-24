package com.jayshah.Chapter_14_Arrays._8;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Number " + (i + 1));
            arr[i] = s.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
