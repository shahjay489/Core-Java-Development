package com.jayshah.chapter_16_Java8_Features._5.MethodConstructorRefDemo;

/**
 * having parameter
 */


interface I3 {
    void m1(String a);
}

class A3 {
    public void m2(String a) {
        System.out.println("hello : " + a);
    }
}

public class Test3 {
    public static void main(String[] args) {
        A3 ob = new A3();
        I3 i = ob::m2;
        i.m1("Govardhan");
    }
}
