package com.jayshah.chapter_15_Collection_Framework_Generics._5.VectorDemo;

import java.util.Vector;

public class Test1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());   // default : 10 capacity

        for (int i = 0; i < 21; i++) {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println(v.capacity());
    }
}