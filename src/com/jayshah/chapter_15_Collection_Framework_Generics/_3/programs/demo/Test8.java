package com.jayshah.chapter_15_Collection_Framework_Generics._3.programs.demo;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add("Govardhan");

        System.out.println(al1.size());

        Object[] obj = al1.toArray();   // convert into Array - store as Object

        for (int i = 0; i < obj.length; i++) {
//            System.out.println(obj[i]);
            System.out.print(obj[i] + " ");
        }
    }
}

/*
    We can convert ArrayList into Array:
                Object[] obj = al1.toArray();
                // convert into Array - store as Object
 */