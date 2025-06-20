package com.jayshah.chapter_16_Java8_Features._3.demo;

import java.util.function.Function;

public class Test5 {
    public static void main(String[] args) {
        Function<String, Integer> f = str -> str.length();

        System.out.println(f.apply("Govardhan"));
        System.out.println(f.apply("Dwarkesh"));

        Function<String, String> f1 = str -> str.concat(" is Software Engineer");

        System.out.println(f1.apply("Govardhan"));
        System.out.println(f1.apply("Dwarkesh"));


    }
}
