package com.jayshah.chapter_15_Collection_Framework_Generics._20.boundsdemo;

//class A<T extends Number & Runnable> {
class A<T extends Number> {
    void show(T t) {
        System.out.println(t);
    }
}

public class Test {
    public static void main(String[] args) {
        A<Integer> ob = new A<Integer>();
        ob.show(101);

        A<Float> ob2 = new A<Float>();
        ob2.show(100f);

        // A<String> ob3 = new A<String>(); // Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'

    }
}
