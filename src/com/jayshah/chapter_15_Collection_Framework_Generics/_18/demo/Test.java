package com.jayshah.chapter_15_Collection_Framework_Generics._18.demo;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.hashCode());

        Test t2 = new Test();
        System.out.println(t2.hashCode());

        /*
            In case of integer,
            the value we are providing, is itself the value of the hashcode.
         */
//        Integer i1 = new Integer(110);
        Integer i1 = 110;
        System.out.println(i1.hashCode());

        String str1 = new String("Govardhan");
        System.out.println(str1.hashCode());
    }
}
