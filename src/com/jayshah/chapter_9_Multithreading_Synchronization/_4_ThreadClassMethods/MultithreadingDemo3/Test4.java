package com.jayshah.chapter_9_Multithreading_Synchronization._4_ThreadClassMethods.MultithreadingDemo3;

public class Test4 extends Thread {
    public void run() {
        System.out.println("hi");
        System.out.println("Child thread : " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        t4.setDaemon(true);     // here we made child thread as Demon thread
        t4.start();

        System.out.println("Main thread : " + Thread.currentThread().isDaemon());
    }
}