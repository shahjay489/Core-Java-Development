package com.jayshah.chapter_15_Collection_Framework_Generics._10.hashSetDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Test4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        System.out.println(al.get(0));  // index based possible for getting value


        HashSet hs = new HashSet();

        hs.add("Mahaprabhuji");
        hs.add("Govardhan");
        hs.add("Dwarkesh");
        hs.add("Yamunaji");
        hs.add("Girirajji");

        //hs.clear();     //[]
        //System.out.println(hs.contains("Govardhan"));
        //hs.remove("Mahaprabhuji");
        System.out.println(hs.size());  //4

        System.out.println(hs); // index based not possible,
        // but using object or iterator can get the value.
    }
}
