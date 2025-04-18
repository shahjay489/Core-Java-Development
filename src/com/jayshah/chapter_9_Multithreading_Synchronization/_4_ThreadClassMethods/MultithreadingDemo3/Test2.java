package com.jayshah.chapter_9_Multithreading_Synchronization._4_ThreadClassMethods.MultithreadingDemo3;

public class Test2 {
    void divide() {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("Govardhan"); // thread-0 by default name
        Test2 t2 = new Test2();
        t2.divide();
    }
}
