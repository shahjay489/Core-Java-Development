package com.jayshah.chapter_15_Collection_Framework_Generics._15.mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        System.out.println();

        HashMap hm = new HashMap();

        hm.put(101, "Govardhan");
        hm.put(102, "Dwarkesh");
        hm.put(103, "Giriraj");
        hm.put(104, "Mahaprabhuji");
        hm.put(105, "Yamunaji");

        System.out.println(hm.getClass());
        System.out.println(hm);

        System.out.println();

        Set set = hm.entrySet();    // hashmap convert into hashset
        System.out.println(set.getClass());
        System.out.println(set);

        System.out.println();

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //System.out.println(itr.next());

            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
//            System.out.println("----------------------------------");
        }
    }
}

/*

    I want to get element one by one not all together.

    This is little bigger way but when we do generics
    that time it will be very small way to do it.

 */