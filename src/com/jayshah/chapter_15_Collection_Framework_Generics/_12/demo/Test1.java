package com.jayshah.chapter_15_Collection_Framework_Generics._12.demo;

import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add("aaa");      //compareTo()
        ts.add("fff");
        ts.add("www");
        ts.add("uuu");
        ts.add("ddd");

        System.out.println(ts);

        TreeSet ts1 = new TreeSet();

        ts1.add(40);        //compareTo()
        ts1.add(70);
        ts1.add(30);
        ts1.add(60);

        System.out.println(ts1);
    }
}

/*
    All wrapper classes inherit comparable interface.
    String also inherit comparable interface.
 */