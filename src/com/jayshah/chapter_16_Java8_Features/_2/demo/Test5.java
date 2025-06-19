package com.jayshah.chapter_16_Java8_Features._2.demo;

interface I5 {
    void m5(int a);
    //void m5(int a, int b);
}

public class Test5 {
    public static void main(String[] args) {
        //I5 i = (a) -> System.out.println(a*a);
        //i.m5(10);

        I5 i = a -> System.out.println(a * a);
        i.m5(10);

        // I5 i = a, b ->System.out.println(a + b); // error: multiple parameters must be in ()
        // i.m5(10, 20);
    }
}
