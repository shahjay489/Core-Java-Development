package com.jayshah.chapter_15_Collection_Framework_Generics._8.CursorsDemo;

import java.util.Enumeration;
import java.util.Vector;

public class Test2 {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.addElement("Govardhan");
        v.addElement("Dwarkesh");
        v.addElement("Giriraj");
        v.addElement("Yamunaji");

        System.out.println(v);

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

/*
    - if you print v
        then it prints all elements together.

    e.nextElement()
    - it prints element one by one not all together.
 */