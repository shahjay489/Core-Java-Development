package com.jayshah.chapter_17_Java_Database_Connecticity._5.demo;

import java.util.Scanner;

public class Test {
    static Scanner s;
    static CrudOperation co;

    void appStarted() {
        System.out.println("=================Java Application Started===============");
        System.out.println("Please Select One Option");
        System.out.println("1 : Select");
        System.out.println("2 : Insert");
        System.out.println("3 : Update");
        System.out.println("4 : Delete");
        System.out.println("5 : Exit");
        System.out.println("=======================================================");
    }

    void getUserInput() {
        int userinput = s.nextInt();
        if (userinput == 1) {
            System.out.println("Enter your email id");
            String email = s.next();
            co.getValues(email);
        } else if (userinput == 2) {
            System.out.println("Enter your name");
            String name = s.next();

            System.out.println("Enter your email");
            String email = s.next();

            System.out.println("Enter your password");
            String pass = s.next();

            System.out.println("Enter your gender");
            String gender = s.next();

            System.out.println("Enter your city");
            String city = s.next();

            co.insertDetails(name, email, pass, gender, city);
        } else if (userinput == 3) {
            System.out.println("Enter your name");
            String name = s.next();

            System.out.println("Enter your email");
            String email = s.next();

            co.updateDetails(name, email);
        } else if (userinput == 4) {
            System.out.println("Enter your email");
            String email = s.next();

            co.deleteDetails(email);
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        s = new Scanner(System.in);
        co = new CrudOperation();

        Test t = new Test();


        while (true) {
            t.appStarted();
            t.getUserInput();
        }
    }
}
