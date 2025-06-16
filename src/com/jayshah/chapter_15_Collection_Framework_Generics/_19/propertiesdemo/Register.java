package com.jayshah.chapter_15_Collection_Framework_Generics._19.propertiesdemo;

import java.io.FileInputStream;
import java.util.Properties;

class Register {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("src/com/jayshah/chapter_15_Collection_Framework_Generics/_19/propertiesdemo/Xyz.properties");
        p.load(fis);
//        System.out.println(p);

        String name = "";
//        String name = "Govardhan";
        String email = "govardhan@gmail.com";

        if (name.equals("")) {
            System.out.println(p.getProperty("name_validation"));
        } else if (email.equals("")) {
            System.out.println("email cannot be empty");
        } else {
            System.out.println("valid");
        }
    }
}