package com.jayshah.chapter_16_Java8_Features._2.demo;

interface I3 {
    void m3();
}

public class Test3 {
    public static void main(String[] args) {
        I3 i = () -> System.out.println("hi");
        i.m3();
    }
}
