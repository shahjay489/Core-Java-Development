package com.jayshah.chapter_16_Java8_Features._2.demo;

/*
interface I1 {
    void m1();
}

class A implements I1 {
    public void m1() {
        System.out.println("i am in m1() method");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A ob = new A();
        ob.m1();
    }
}
*/

interface I1 {
    void m1();
    //void m2();
}

public class Test1 {
    public static void main(String[] args) {

        /*
            Here, we override interface method,
            we can not create the object of the interface,
            that is why we need to override the method

            we already have seen before how internally this works
            internally, it creates anonymous class at backend
            if you have 2 methods in the interface then you need to override 2 methods.

         */

        I1 ob = new I1() {
            public void m1() {
                System.out.println("i am in m1() method...!!");
            }
//            public void m2()
//            {
//                
//            }
        };
        ob.m1();
    }
}