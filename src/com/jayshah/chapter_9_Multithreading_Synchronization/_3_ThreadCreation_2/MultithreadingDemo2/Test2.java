package com.jayshah.chapter_9_Multithreading_Synchronization._3_ThreadCreation_2.MultithreadingDemo2;

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("hi");
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();
        mt2.start();
        //mt2.start(); it will provide an exception because we cannot start one thread 2 times
    }
}