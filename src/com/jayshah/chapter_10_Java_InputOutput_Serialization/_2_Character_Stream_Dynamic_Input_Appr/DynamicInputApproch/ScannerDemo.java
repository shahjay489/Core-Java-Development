package com.jayshah.chapter_10_Java_InputOutput_Serialization._2_Character_Stream_Dynamic_Input_Appr.DynamicInputApproch;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email1 = s.next();
        System.out.println("Enter Password : ");
        String pass1 = s.next();
        if (email1.equals("admin@gmail.com") && pass1.equals("admin123")) {
            System.out.println("login successfully");
        } else {
            System.out.println("login failed");
        }
    }
}
