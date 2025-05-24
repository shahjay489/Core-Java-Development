package com.jayshah.chapter_14_Arrays._8;

import java.util.Scanner;

public class PasswordGenerator {
    static String name;
    static int dob;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name : ");    // Govardhan
        name = s.next();
        System.out.println("Enter DOB : ");     // year
        dob = s.nextInt();

        String newname = PasswordGenerator.getSpecifiedString();
        int newdob = PasswordGenerator.dobAlgo();

        String newpass = "SP" + newname + "@" + newdob;
        System.out.println("Your password is : " + newpass);
    }

    static String getSpecifiedString() {
        String newname;
        char c = name.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            //newname = name.substring(1, 3);
            char c1 = name.charAt(0);
            char c2 = name.charAt(1);
            newname = String.valueOf(c1) + String.valueOf(c2).toUpperCase(); // method chaining: we use one method then after use another method.
        } else {
            char c1 = name.charAt(0);
            char c2 = name.charAt(name.length() - 1);
            newname = String.valueOf(c1) + String.valueOf(c2).toUpperCase();    // method chaining: we use one method then after use another method.
        }
        return newname;
    }

    static int dobAlgo() {
        int newdob = 0, rem;    // rem : reminder

        // reverse dob
        while (dob != 0) {      // run while loop till dob = -1
            rem = dob % 10;
            newdob = newdob * 10 + rem;
            dob = dob / 10;
        }
//        System.out.println("newdob: " + newdob);
        return (newdob + 100);
    }
}


/*
    static String name;
    static int dob;

    - we have created instance variables so that these can be used in another method, but it's much better if you pass these variables through arguments in method call

 */