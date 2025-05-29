package com.jayshah.chapter_15_Collection_Framework_Generics._6.StackDemo;

import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("Govardhan");
        s.push("Dwarkesh");
        s.push("Giriraj");
        s.push("Yamunaji");

        // it counts from the top : remember this is stack
        // do not confuse between count as index and count as in stack
        System.out.println(s.search("Giriraj"));    // 2
        System.out.println(s.search("Yamunaji"));   // 1
        // if value is not available then it returns -1.

        System.out.println(s.empty());
        s.clear();
        System.out.println(s.empty());
    }
}
