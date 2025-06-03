package com.jayshah.chapter_15_Collection_Framework_Generics._12.task;

import java.util.Comparator;
import java.util.TreeSet;

class MySorting implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // first convert into string so we can call string methods
        String s1 = o1.toString();
        String s2 = o2.toString();

        int leng1 = s1.length();
        int leng2 = s2.length();

        if (leng1 > leng2) {
            return 1;
        } else if (leng1 < leng2) {
            return -1;
        } else {

            //return 0; // this will not give proper output : [A, BB, BBB, AAAA]
            // because if both length same then it will return 0
            // like AA,BB or AAA, BBB
            // it considers as duplicate, so it will not insert duplicate element

            return s1.compareTo(s2);
        }
    }
}

public class Test {
    public static void main(String[] args) {

        // TreeSet ts = new TreeSet();  // [A, AA, AAA, AAAA, B, BB, BBB]

        // customize sorting
        TreeSet ts = new TreeSet(new MySorting());  // [A, B, AA, BB, AAA, BBB, AAAA]

        ts.add("AAAA");
        ts.add("BB");
        ts.add("A");
        ts.add("BBB");
        ts.add("AA");
        ts.add("AAA");
        ts.add("B");
        System.out.println(ts);
    }
}
