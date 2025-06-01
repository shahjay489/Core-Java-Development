package com.jayshah.chapter_15_Collection_Framework_Generics._10.linkedHashSetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test5 {
    public static void main(String[] args) {
//        HashSet hs=new HashSet(); // it does not follow insertion order

        LinkedHashSet hs = new LinkedHashSet();
        // follow insertion order

        hs.add("Mahaprabhuji");
        hs.add(10);
        hs.add("Govardhan");
        hs.add("Dwarkesh");
        hs.add("Yamunaji");
        hs.add("Girirajji");

        System.out.println(hs);
    }
}
