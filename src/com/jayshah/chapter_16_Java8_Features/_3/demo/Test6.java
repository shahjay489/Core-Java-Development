package com.jayshah.chapter_16_Java8_Features._3.demo;

import java.util.function.Consumer;

public class Test6 {
    public static void main(String[] args) {
        Consumer<String> c = str -> System.out.println("hi : " + str.concat("@gmail.com"));

        c.accept("Govardhan");
        c.accept("Dwarkesh");
    }
}
