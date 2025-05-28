package com.jayshah.chapter_15_Collection_Framework_Generics._4.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Govardhan");
        al.add("Yamunaji");
        al.add("Dwarkesh");
        al.add("Mahaprabhuji");


        LinkedList ll = new LinkedList(al);
        ll.addFirst("Giriraj");

        System.out.println(ll);
    }
}