package com.jayshah.chapter_15_Collection_Framework_Generics._6.StackDemo;

public class Test {
    void m1() {
        System.out.println("i am in m1 method");
        m3();
        System.out.println("m1");
    }

    void m2() {
        System.out.println("I am in m2 method");
        m1();
        System.out.println("m2");
    }

    void m3() {
        System.out.println("I am in m3 method");
        System.out.println("m3");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m2();
    }
}
