package com.jayshah.chapter_15_Collection_Framework_Generics._3.programs.demo;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(50);
        al.add(80);
        al.add("Govardhan");
        al.add(90);
        al.add(20);
        al.add("Giriraj");

        System.out.println(al);

//        al.remove(2);     // remove at particular index position
        //al.remove(50); // error : treat as index position
//        al.remove("Giriraj"); // remove from ArrayList
        al.removeAll(al);

        System.out.println(al);
    }
}

/*
    Store as an object into the ArrayList.

    - also you can give index position,
        but if you give any int value e.g. 50,
        then it will treat as index position
        and here that position is not available
        so, it gives ArrayIndexOutOf bound exception.
 */