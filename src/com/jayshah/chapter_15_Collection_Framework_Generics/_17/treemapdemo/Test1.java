package com.jayshah.chapter_15_Collection_Framework_Generics._17.treemapdemo;

import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        tm.put(106, "Girirrajji");
        tm.put(101, "Govardhan");
        tm.put(103, "ShriNathji");
        tm.put(102, "Dwarkesh");
        tm.put(105, "Yamunaji");
        tm.put(104, "Mahaprabhuji");

        System.out.println(tm);

        //tm.put("abc", "Gopal");   // java.lang.ClassCastException
        //tm.put(null, "Radha");    // java.lang.NullPointerException

        // It can not store duplicate element
        // it will replace old value with new value.
        tm.put(102, "Madhav");

        System.out.println(tm);
    }
}