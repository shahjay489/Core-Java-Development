package com.jayshah.chapter_9_Multithreading_Synchronization._4_ThreadClassMethods_1.MultithreadingDemo3;

public class Test3 extends Thread {
    public void run() {
        System.out.println("hi");
        System.out.println("Old Child Thread Name : " + Thread.currentThread().getName());
        Thread.currentThread().setName("my_child_thread");
        System.out.println("New Child Thread Name : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Old Main Thread Name : " + Thread.currentThread().getName());
        Thread.currentThread().setName("my_main_thread");
        System.out.println("New Main Thread Name : " + Thread.currentThread().getName());

        Test3 t3 = new Test3();
        t3.start();
//        System.out.println("---Old Main Thread Name : "+t3.getName());
    }
}