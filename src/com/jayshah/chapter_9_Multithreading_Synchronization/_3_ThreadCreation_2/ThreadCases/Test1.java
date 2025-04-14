package com.jayshah.chapter_9_Multithreading_Synchronization._3_ThreadCreation_2.ThreadCases;

//Performing Single Task from Single Thread
class MyThread1 extends Thread {
    public void run() {
        System.out.println("hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start();
    }
}