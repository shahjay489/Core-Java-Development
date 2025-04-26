package com.jayshah.chapter_9_Multithreading_Synchronization._5_ThreadClassMethods_2.MultithrreadingDemo4;

class MyThread extends Thread {
    public void run() {
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("Child thread priority : " + Thread.currentThread().getPriority());
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread(); // mt is a child thread - priority by default is 5
        mt.start();

        //mt.setPriority(8);
        //System.out.println("Child thread priority : "+mt.getPriority());

        Thread.currentThread().setPriority(8);  // set priority of the main thread

        System.out.println("hello : " + Thread.currentThread().getName());
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
    }
}