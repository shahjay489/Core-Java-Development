package com.jayshah.chapter_15_Collection_Framework_Generics._19.propertiesdemo;

import java.io.FileInputStream;
import java.util.Properties;

class Register2 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("src/com/jayshah/chapter_15_Collection_Framework_Generics/_19/propertiesdemo/application.properties");
        p.load(fis);

        // Values are getting from property file
        String name = p.getProperty("name");
        String email = p.getProperty("email");
        String password = p.getProperty("password");
        boolean valid =  password.equals("123");
        System.out.println("Name: "+name);
        System.out.println("Email: " + email);
        System.out.println("Password Valid: " + valid);
    }
}

/*
    Output:
    ---------------
    Govardhan
    govardhan@gmail.com

 */