package com.jayshah.chapter_15_Collection_Framework_Generics._10.hashSetDemo;

import java.util.HashSet;

public class Test3 {
    public static void main(String[] args) {
        //HashSet hs=new HashSet(5, .80f);

        HashSet hs = new HashSet();

        hs.add("Mahaprabhuji");
        hs.add("Govardhan");
        hs.add("Dwarkesh");
        hs.add("Girirajji");
        hs.add("Yamunaji");

        hs.add("Govardhan");
        hs.add("Dwarkesh");

        System.out.println(hs);
    }
}

// duplicate element can not store.
// it does not give you error but it will not allow duplicate element
