package com.jayshah.chapter_15_Collection_Framework_Generics._6.StackDemo;

import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("Govardhan");
        s.push("Dwarkesh");
        s.push("Giriraj");
        s.push("Yamunaji");

        System.out.println(s);
        //System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
    }
}
