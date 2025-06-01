package com.jayshah.chapter_15_Collection_Framework_Generics._10.navigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test8 {
    public static void main(String[] args) {
        NavigableSet ss = new TreeSet();

        ss.add("aaa");
        ss.add("bbb");
        ss.add("ddd");
        ss.add("eee");
        ss.add("fff");

        //System.out.println(ss.descendingSet());  //[fff, eee, ddd, bbb, aaa]

        //System.out.println(ss.ceiling("ccc")); // ddd : it means bigger than ccc
        //System.out.println(ss.ceiling("fff")); // fff : it means there no bigger than fff so it returns the same value

        //System.out.println(ss.higher("ddd"));
        //System.out.println(ss.floor("bbb"));
        //System.out.println(ss.lower("bbb"));
        System.out.println(ss.pollFirst());
        System.out.println(ss.pollLast());
    }
}
