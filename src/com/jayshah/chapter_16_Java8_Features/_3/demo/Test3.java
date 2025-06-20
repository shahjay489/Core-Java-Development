package com.jayshah.chapter_16_Java8_Features._3.demo;

import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        Predicate<String> p1 = pass -> pass.length() > 6;
        Predicate<String> p2 = pass -> pass.equals("admin@123");

        System.out.println(p1.test("abc12345"));
        System.out.println(p2.test("govardhan@123"));

        Predicate pMatch = p1.and(p2);
        System.out.println(pMatch.test("admin@12"));

        Predicate p = p1.or(p2);
        System.out.println(p.test("admin@12"));
    }
}
