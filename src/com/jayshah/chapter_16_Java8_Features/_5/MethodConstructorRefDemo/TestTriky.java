package com.jayshah.chapter_16_Java8_Features._5.MethodConstructorRefDemo;

import java.util.ArrayList;

public class TestTriky {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        al.stream().filter(e -> e > 30).forEach(System.out::println);
    }
}

/*
    System.out::println

    out : object of the System class
    println : method

    here we use Method Reference
    we can print by using like this
 */