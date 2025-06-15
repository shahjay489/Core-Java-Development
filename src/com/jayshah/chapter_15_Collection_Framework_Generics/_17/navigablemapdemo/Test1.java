package com.jayshah.chapter_15_Collection_Framework_Generics._17.navigablemapdemo;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        NavigableMap nm = new TreeMap();

        nm.put(101, "Govardhan");
        nm.put(102, "Dwarkesh");
        nm.put(103, "ShriNathji");
        nm.put(104, "Mahaprabhuji");
        nm.put(105, "Yamunaji");
        nm.put(106, "Girirrajji");


        System.out.println(nm);

        System.out.println(nm.descendingMap());
        System.out.println(nm.ceilingEntry(103));
        System.out.println(nm.higherKey(103));
        System.out.println(nm.lowerEntry(104));
        System.out.println(nm.floorKey(104));   // check itself first, if it is present or not, if not then give last key
        System.out.println("floorKey 109 :"+  nm.floorKey(109)); // output: 106

        System.out.println(nm.pollFirstEntry());
        System.out.println(nm);

        System.out.println(nm.pollLastEntry());
        System.out.println(nm);
    }
}
