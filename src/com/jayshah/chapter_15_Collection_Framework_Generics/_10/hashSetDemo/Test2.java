package com.jayshah.chapter_15_Collection_Framework_Generics._10.hashSetDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add(100);

        HashSet hs = new HashSet(al);   // we pass here collection object

        hs.add("Mahaprabhuji");
        hs.add(10);
        hs.add("Govardhan");
        hs.add("Dwarkesh");
        hs.add("Yamunaji");
        hs.add("Girirajji");

        System.out.println(hs);
    }
}
