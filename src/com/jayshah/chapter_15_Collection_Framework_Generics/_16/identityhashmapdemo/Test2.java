package com.jayshah.chapter_15_Collection_Framework_Generics._16.identityhashmapdemo;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test2 {
    public static void main(String[] args) {
        // 'Integer(int)' is deprecated since version 9 and marked for removal
        // Integer i1 = new Integer(101);
        // Integer i2 = new Integer(102);

        /*
            there are 2 ways to solve above errors..

            1.) autoboxing
                Integer i1 = 101;
                Integer i2 = 102;

            2.) explicitly
                Integer i1 = Integer.valueOf(101);
                Integer i2 = Integer.valueOf(102);
         */

        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);

        HashMap hm = new HashMap();
        hm.put(i1, "Govardhan");
        hm.put(i2, "Dwarkesh");        // i1.equals(i2) - true
        System.out.println(hm);

        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(i1, "Govardhan");
        ihm.put(i2, "Dwarkesh");       // i1==i2 - false
        System.out.println(ihm);
    }
}

// output written in comment here is before java9