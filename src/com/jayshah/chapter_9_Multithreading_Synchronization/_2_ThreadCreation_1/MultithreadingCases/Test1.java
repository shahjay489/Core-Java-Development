package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingCases;

class Abc1 extends Thread {

    /*
        if you write start() method instead of run() method
        then program will execute but thread can not be created
        - it just treats as a method - see next Test2.java program
     */

    public void run() {
        System.out.println("hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Abc1 ob1 = new Abc1();
        ob1.start();
    }
}
