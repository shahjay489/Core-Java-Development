package com.jayshah.chapter_15_Collection_Framework_Generics._15.mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println("ArrayList: " + al);


        HashMap hm = new HashMap();

        hm.put(101, "Govardhan");
        hm.put(102, "Dwarkesh");
        hm.put(103, "Giriraj");
        hm.put(104, "Mahaprabhuji");
        hm.put(105, "Yamunaji");

        System.out.println("HashMap: " + hm);

        System.out.println(hm.get(103));

        System.out.println(hm.size());

        System.out.println(hm.containsKey(114));
        System.out.println(hm.containsValue("jay"));

        System.out.println("HashMap-Keys: " + hm.keySet());
        System.out.println("HashMap-Values: " + hm.values());

//        System.out.println("Values store in a ArrayList: " + new ArrayList(hm.values()));
//        System.out.println("Values store in a HashSet: " + new HashSet<>(hm.values()));

        System.out.println(hm.remove(103));
        System.out.println(hm);

        hm.clear();
        System.out.println(hm);
    }
}
/*

    size : It starts with 1
    index : It starts with 0

 -> hm.keySet():
    KeySet returns in a Set form
    because set does not have duplicate elements and
    Keys always unique.

 -> hm.values():
    it returns in a collection form,
    so we can store in ArrayList, HashSet etc.
    according to project requirements.



 */