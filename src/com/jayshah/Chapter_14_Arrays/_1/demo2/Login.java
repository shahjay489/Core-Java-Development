package com.jayshah.Chapter_14_Arrays._1.demo2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter email id:");
        String email = scanner.next();

        // password always use in CharacterArray form
        // here we take it in String just for leaning
        System.out.println("Enter Password");
        String password = scanner.next();


        if (email.equals("admin@gmail.com") && password.equals("admins")) {
            String name = "Govardhan"; // name came from database.
            String dob = "1-1-0000";
            String city = "Vraj";
            String phone = "12345";
            int age = 100;

            // using constructor
            Profile p = new Profile(name,dob,age,city,phone); // pass the sequence of the arguments based on the Constructor parameters
            p.welcome();

        } else {
            System.out.println("Invalid login");
        }


    }
}


/*

        -> if we use the do-while loop then it will keep asking
 */