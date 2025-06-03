package com.jayshah.chapter_15_Collection_Framework_Generics._11.treeSetDemo;

import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        //ts.add(null);

        ts.add("EEE");
        ts.add("GGG");
        ts.add("BBB");
        ts.add("DDD");
        ts.add("CCC");
        ts.add("AAA");
        ts.add("FFF");

        System.out.println(ts);
    }
}