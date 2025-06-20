package com.jayshah.chapter_16_Java8_Features._3.demo;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        Predicate<Integer> ob = no -> no % 2 == 0;
        System.out.println(ob.test(20));
    }
}

// --------------------- USING LAMBDA EXPRESSION ---------------------

/*
// here I1 is a functional interface
// (having only one abstract method, any number of default/static methods)
// for functional interface, we do not need to make implemented class
// because we can use Lambda function

interface I1 {
    public boolean test(int no);
}

public class Test1 {
    public static void main(String[] args) {
        I1 ob = no -> no % 2 == 0;
        System.out.println(ob.test(13));
    }
}

*/

// ---------------------- TRADITIONAL WAY --------------------
/*
interface I1 {
    public boolean test(int no);
}

class A implements I1 {
    public boolean test(int no) {
        return no % 2 == 0;
    }
}

public class Test1 {
    public static void main(String[] args) {
        I1 ob = new A();        // Runtime Polymorphism
        System.out.println(ob.test(13));
    }
}
*/






//----------------------Convert to Lambda Expression -----------------------------
/*

    interface I1 {
        public boolean test(int no);
    }

    class A implements I1 {
        public boolean test(int no) {
            return no % 2 == 0;
        }
    }
              |    |
              |    |
              |    |
              |    |
              |    |
             \      /
              \    /
               \  /
                \/
    I1 ob = (int no) -> {
            return no % 2 = 0;
        };
    System.out.println(13);
              |    |
              |    |
              |    |
              |    |
              |    |
             \      /
              \    /
               \  /
                \/
    I1 ob = no -> no % 2 == 0;
    System.out.println(ob.test(13));

              |    |
              |    |
              |    |
              |    |
              |    |
             \      /
              \    /
               \  /
                \/
     Java has given similar predefine interface same like
     above we did, and it's name is Predicate<T>
     This is generic type predefine interface

        Predicate<Integer> ob = no -> no % 2 == 0;
        System.out.println(ob.test(20));
 */