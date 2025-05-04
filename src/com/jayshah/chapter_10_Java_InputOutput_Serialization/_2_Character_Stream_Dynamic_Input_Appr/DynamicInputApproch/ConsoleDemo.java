package com.jayshah.chapter_10_Java_InputOutput_Serialization._2_Character_Stream_Dynamic_Input_Appr.DynamicInputApproch;

import java.io.Console;

/*
    This program is not working in IDE.
    Copy and paste in the notepad and run in terminal

    Console: for security
    Put password in character array,
    so when you type in terminal, you can not see but then enter you will successfully login.
    console Gives security.
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        try {
            Console c = System.console();
            String email1 = c.readLine("Enter Email : ");

            char[] pass = c.readPassword("Enter Password : ");
            String pass1 = new String(pass);

            if (email1.equals("admin@gmail.com") && pass1.equals("admin123")) {
                System.out.println("Login successfully");
            } else {
                System.out.println("login failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
