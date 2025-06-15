package com.jayshah.chapter_15_Collection_Framework_Generics._17.sortedmapdemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        SortedMap sm = new TreeMap();

        sm.put(101, "Govardhan");
        sm.put(102, "Dwarkesh");
        sm.put(103, "ShriNathji");
        sm.put(104, "Mahaprabhuji");
        sm.put(105, "Yamunaji");
        sm.put(106, "Girirrajji");

        System.out.println(sm);
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap(104));
        System.out.println(sm.tailMap(104));
        System.out.println(sm.subMap(102, 105));
    }
}
