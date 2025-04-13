package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingCases;

class Abc3 extends Thread {
    public void run() {
        System.out.println("hi");
    }
}


/*
    program will execute but thread can not be created
       - it just treats as a method because we do not use start() method
 */
public class Test3 {
    public static void main(String[] args) {
        Abc3 ob1 = new Abc3();
        ob1.run();
    }
}