package com.jayshah.chapter_15_Collection_Framework_Generics._16.weakhashmapdemo;

class A {
    A() {
        System.out.println("object created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object deleted");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A ob = new A();

        // how to delete object?
        // so we need to null reference value
        // then object will be null automatically
        ob = null;
        System.gc();
    }
}
