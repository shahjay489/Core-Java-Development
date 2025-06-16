package com.jayshah.chapter_15_Collection_Framework_Generics._20.genericmethods;

import java.util.ArrayList;

class A {
    void show(ArrayList<?> al) {
        System.out.println(al);
    }
}

public class Test {
    public static void main(String[] args) {
        A ob1 = new A();

        ArrayList<String> al = new ArrayList<String>();
        ob1.show(al);

        ArrayList<Integer> all = new ArrayList<Integer>();
        ob1.show(all);
    }
}
