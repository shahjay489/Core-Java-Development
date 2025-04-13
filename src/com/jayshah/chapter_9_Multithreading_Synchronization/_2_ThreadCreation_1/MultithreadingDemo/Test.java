package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingDemo;

// normally we do not make main class Thread

// we can make one class as Thread and then call from the main class
// See in the next example.
public class Test extends Thread {
    @Override
    public void run() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}