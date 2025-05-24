package com.jayshah.chapter_14_Arrays._1.demo2;

public class Profile {

    String name;
    String dob;
    String city;
    String phone;
    int age;

    // using constructor
    Profile(String name, String dob, int age, String city, String phone) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.city = city;
        this.phone = phone;
    }

    void welcome() {
        System.out.println("Welcome " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Phone: " + phone);
    }

}
