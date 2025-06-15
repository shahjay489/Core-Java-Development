package com.jayshah.chapter_15_Collection_Framework_Generics._18.demo;

/*
    In this program,
    we override hashcode value..

 */
class A {
    int i;

    A(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i + "";
    }
}

public class Test1 {
    public static void main(String[] args) {
        A ob1 = new A(1);
        System.out.println(ob1.hashCode());

        A ob2 = new A(2);
        System.out.println(ob2.hashCode());
    }
}
