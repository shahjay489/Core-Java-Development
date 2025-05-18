package com.jayshah.Chapter_14_Arrays._1.demo;

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

            // using constructor
            Profile p = new Profile(name);
            p.welcome();

            // using method :
            //Profile p = new Profile();
            //p.welcome(name);

        } else {
            System.out.println("Invalid login");
        }


    }
}


/*

        -> if we use the do-while loop then it will keep asking
 */