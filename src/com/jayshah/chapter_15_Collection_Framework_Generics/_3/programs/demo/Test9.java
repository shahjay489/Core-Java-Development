package com.jayshah.chapter_15_Collection_Framework_Generics._3.programs.demo;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add("Govardhan");
        al1.add(20);

        System.out.println(al1.get(2));

        al1.set(1, 100);    // replace with this new value.
        System.out.println(al1);
        System.out.println(al1.indexOf(20));    // counting from start (left to right)
        System.out.println(al1.lastIndexOf(20));   // counting from last (right to left but number of position will be same)
        System.out.println(al1.lastIndexOf(200));
    }
}
