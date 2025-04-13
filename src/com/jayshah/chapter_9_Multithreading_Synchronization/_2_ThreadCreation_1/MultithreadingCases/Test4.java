package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingCases;

class Abc4 extends Thread {

    public void run() {
        System.out.println("hi");
    }

    // we can override the run method
    public void run(int a) {
        System.out.println(a);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Abc4 ob1 = new Abc4();

        // this is making calling new thread
        // also it calls only this run() method
        ob1.start();

        /*
          - this one is completely different method
          - it does not have any link with Thread class
          - If you call ob1.run() instead of start(),
            it won’t start a new thread — it will just run run() in the main thread.

        */
        ob1.run(10);
    }
}