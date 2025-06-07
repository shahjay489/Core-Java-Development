package com.jayshah.chapter_15_Collection_Framework_Generics._13.queueDemo;

import java.util.PriorityQueue;

public class Test1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        // pq.add("aaa");
        // always try to use offer() method
        pq.offer("aaa");
        pq.offer("bbb");
        pq.offer("ccc");
        pq.offer("ddd");
        pq.offer("eee");
        pq.offer("fff");

        System.out.println(pq);

        // if there is no value available then it will just return null.
//        System.out.println(pq.peek());
//        System.out.println(pq);

        // if there is no value available then it will throw an exception.
        //System.out.println(pq.element());
        //System.out.println(pq);

        // if there is no value available then it will just return null.
        System.out.println(pq.poll());
        System.out.println(pq);

        // if there is no value available then it will throw an exception.
//        System.out.println(pq.remove());
//        System.out.println(pq);
    }
}
