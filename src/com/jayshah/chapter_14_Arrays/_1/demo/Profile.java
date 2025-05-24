package com.jayshah.chapter_14_Arrays._1.demo;

public class Profile {

    String name;

    // using constructor
    Profile(String name) {
        this.name = name;
    }
    void welcome() {
        System.out.println("Welcome "+ name);
    }

    // using method
//    void welcome(String name) {
//        System.out.println("Welcome "+ name);
//    }

}
