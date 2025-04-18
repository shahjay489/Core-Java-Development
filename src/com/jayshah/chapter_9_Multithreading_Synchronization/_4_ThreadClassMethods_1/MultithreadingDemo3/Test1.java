package com.jayshah.chapter_9_Multithreading_Synchronization._4_ThreadClassMethods_1.MultithreadingDemo3;

public class Test1 extends Thread {
    public void run() {
        System.out.println("hi");
        System.out.println("1 : " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.start();
        System.out.println("2 : " + Thread.currentThread().getName());

        System.out.println(t1.isAlive());
    }
}