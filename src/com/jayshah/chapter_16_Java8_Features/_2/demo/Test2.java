package com.jayshah.chapter_16_Java8_Features._2.demo;

@FunctionalInterface
interface I2 {
    void m2();
}

public class Test2 {
    public static void main(String[] args) {
//        I2 i=() ->
//            {
//                System.out.println("hi i am lambda function...!");
//            };
//        i.m2();

        I2 i = () -> {
            System.out.println("hi i am in lambda function..!!");
        };
        i.m2();
    }
}