package com.jayshah.chapter_9_Multithreading_Synchronization._4_ThreadClassMethods.MultithreadingDemo3;

class MyThread5 extends Thread {
    public void run() {
        System.out.println("hi");
        System.out.println("Child thread : " + Thread.currentThread().isDaemon());
    }
}

public class Test5 {
    public static void main(String[] args) {
        //Thread.currentThread().setDaemon(true);

        MyThread5 mt5 = new MyThread5();
        mt5.setDaemon(true);
        mt5.start();
        //mt5.setDaemon(true);  // Exception: java.lang.IllegalThreadStateException
        /*
            Note: Once you start the thread then you can not make it / set it as Demon thread
            - Let's think...
            -  What is the Demon thread?
               execute in the background
               so, once you start the thread then how it is possible to run in the background
         */

        System.out.println("Main thread : " + Thread.currentThread().isDaemon());
    }
}
