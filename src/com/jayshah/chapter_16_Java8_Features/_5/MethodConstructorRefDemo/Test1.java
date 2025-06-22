package com.jayshah.chapter_16_Java8_Features._5.MethodConstructorRefDemo;

/**
 * Reference to an instance method
 */


@FunctionalInterface
interface I1 {
    void m1();
}

class A {
    public void m2() {
        System.out.println("i am m1() method in class A");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A ob = new A();
        /*
            here, we can do like this
            ob.m2();
            and this is working well.
            But, I want to call m1()
                 and I need implementation of m2() into m1()
            it means I call m1() method but actually it will call m2() method

            So, to achieve, we need to map m1() method to m2() method
            or we will provide reference m1() method to m2() method.

            Note: here it does not have any relation between interface I1 and class A.

            Method Reference => ::
         */
        I1 i = ob::m2;  // note: here there is no round braces () with the method
        i.m1();
    }
}


/*
***********    Traditional Approach    ***********

    interface I1 {
        void m1();
    }

    class A implements I1{
        public void m1() {
            System.out.println("i am m1() method in class A");
        }
    }

    public class Test1 {
        public static void main(String[] args) {
            A ob = new A();
            ob.m1();
        }
    }
*/