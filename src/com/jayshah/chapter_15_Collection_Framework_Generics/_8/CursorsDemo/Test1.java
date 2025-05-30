package com.jayshah.chapter_15_Collection_Framework_Generics._8.CursorsDemo;

import java.util.ArrayList;

public class Test1 {
    String name;
    int id;

    @Override
    public String toString() {
        return name + ", " + id;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        t1.name = "Mahaprabhuji";
        t1.id = 101;

        System.out.println(t1); // Test1@e9e54c2 - if you do not override the toString() method.

        //----------------------------------------------

        ArrayList al = new ArrayList();

        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Yamunaji");


        System.out.println(al); // [Govardhan, Dwarkesh, Giriraj, Yamunaji]
    }
}

/*

    toString() method is Object class method.

    Test1 (directly) and ArrayList (indirectly) both are inherit Object class.

    - in Test1 class we need to override manually toString method,
    but ArrayList and any Collections has override toString() method internally that is why it prints elements directly.

 */