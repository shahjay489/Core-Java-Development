package com.jayshah.chapter_15_Collection_Framework_Generics._4.LinkedListDemo;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("Govardhan");
        ll.add("Yamunaji");
        ll.add("Dwarkesh");
        ll.add("Mahaprabhuji");
        ll.add("Giriraj");

        //System.out.println(ll.removeFirst()+" element is removed");

        ll.removeLast();

        System.out.println(ll);
    }
}
