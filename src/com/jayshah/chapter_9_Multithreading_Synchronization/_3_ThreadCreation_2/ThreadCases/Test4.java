package com.jayshah.chapter_9_Multithreading_Synchronization._3_ThreadCreation_2.ThreadCases;

//Performing Multiple Task from Multiple Threads

class MyThread4 extends Thread {
    public void run() {
        System.out.println("hi");
    }
}

class MyThread44 extends Thread {
    public void run() {
        System.out.println("hello");
    }
}

class MyThread444 extends Thread {
    public void run() {
        System.out.println("hey");
    }
}

public class Test4 {
    public static void main(String[] args) {
        MyThread4 mt1 = new MyThread4();
        mt1.start();

        MyThread44 mt2 = new MyThread44();
        mt2.start();

        MyThread444 mt3 = new MyThread444();
        mt3.start();
    }
}

/*
    - Here all 4 threads are executed together:
         1.) main thread
         2.) thread 0 : mt1.start();
         3.) thread 1 : mt2.start();
         4.) thread 2 : mt3.start();
 */