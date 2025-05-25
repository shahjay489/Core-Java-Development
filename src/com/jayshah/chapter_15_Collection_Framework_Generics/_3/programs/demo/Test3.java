package com.jayshah.chapter_15_Collection_Framework_Generics._3.programs.demo;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        System.out.println(al1.add(10));
        System.out.println(al1.add(50));
        System.out.println(al1.add(30));
        System.out.println(al1.add(20));
        System.out.println(al1.add(20));   // we can store duplicate value in ArrayList
        System.out.println(al1.add(null)); // we can store any number of null values in ArrayList
        System.out.println(al1);
    }
}

/*
    ArrayList follows Sequence.
    But, it is not follow Sorting.
 */