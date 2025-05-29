package com.jayshah.chapter_15_Collection_Framework_Generics._5.VectorDemo;

import java.util.Vector;

public class Test2 {
    public static void main(String[] args) {
        Vector v = new Vector(7);
        System.out.println(v.capacity());

        for (int i = 0; i < 15; i++) {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println(v.capacity());
    }
}
