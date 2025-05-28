package com.jayshah.chapter_15_Collection_Framework_Generics._4.LinkedListDemo;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("Govardhan");
        ll.addLast("Yamunaji");
        ll.add("Dwarkesh");
        ll.addFirst("Mahaprabhuji");

        ll.add(3, "Giriraj");

        System.out.println(ll);
    }
}

// you have to play with this all methods
// change the sequence and check the output
// output will be changed
// also check when you can get an error