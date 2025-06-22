package com.jayshah.chapter_16_Java8_Features._5.MethodConstructorRefDemo;

/**
 * Reference to a static method
 */


interface I2 {
    void m1();
}

class A2 {
    static void m2() {
        System.out.println("hiiii");
    }
}

public class Test2 {
    public static void main(String[] args) {
        I2 i = A2::m2;
        i.m1();
    }
}

/*
    - we can call static method directly through class name
 */