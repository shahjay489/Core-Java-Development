package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.voting;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();

        if (age < 18) {
            try {
                throw new InvalidAgeException("You cannot vote as your age is below 18");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("you can vote now...!!");
        }

        System.out.println("------------------Thank you-------------------");
    }
}
