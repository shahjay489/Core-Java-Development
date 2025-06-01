package com.jayshah.chapter_15_Collection_Framework_Generics._10.hashSetDemo;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {

        // set is an interface, but we can not make object of the interface.
        // here we use implemented class (HashSet) of the Set interface, so we can make the object.
        Set hs = new HashSet();

        hs.add("Mahaprabhuji");
        hs.add(10);
        hs.add("Govardhan");
        hs.add("Dwarkesh");
        hs.add("Yamunaji");
        hs.add("Girirajji");

        System.out.println(hs);
    }
}
