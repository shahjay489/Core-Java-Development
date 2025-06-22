package com.jayshah.chapter_16_Java8_Features._5.MethodConstructorRefDemo;

/**
 * Constructor Reference
 */

interface I4 {
    void m1();
}

class A4 {
    A4() {
        System.out.println("constructor...!!");
    }
}

public class Test4 {
    public static void main(String[] args) {
        // new A4();
        I4 i = A4::new;
        i.m1();
    }
}

/*
    when I call m1() method that time I want to call constructor A4().
 */