package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingCases;

/*
    program will execute but thread can not be created
        - it just treats as a method
 */
class Abc2 extends Thread {
    public void start() {
        System.out.println("hi");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Abc2 ob1 = new Abc2();
        ob1.start();
    }
}