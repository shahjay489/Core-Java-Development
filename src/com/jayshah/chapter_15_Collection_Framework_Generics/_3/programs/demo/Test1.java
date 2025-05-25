package com.jayshah.chapter_15_Collection_Framework_Generics._3.programs.demo;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();   //capacity - 10; size - 0

        al.add(0, 50);
        al.add(1, 90);
        al.add(20);
        al.add("Govardhan");
        al.add(3, "Dwarkesh");

        System.out.println(al);
    }
}

/*
    1. you can insert value directly or by using the index position.
    2. you can not skip any position and add value in next position.
        - from the starting, you need to add elements at each and every points
        - so, let's say you want to insert at 5th position and, you
           skip position 4 then it will throw an Exception in thread "main" java.lang.IndexOutOfBoundsException.
    3.


 */