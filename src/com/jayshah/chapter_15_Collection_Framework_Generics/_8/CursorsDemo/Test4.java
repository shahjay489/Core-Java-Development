package com.jayshah.chapter_15_Collection_Framework_Generics._8.CursorsDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Yamunaji");

        //----------forward direction-----------------------------------------
        ListIterator li = al.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("-------------------------------------");

        //-------------backword direction------------------------------------
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
