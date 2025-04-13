package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingCases;

/*
    not giving the run time error
    thread will create
    but, it calls Thread class run() method
    in Thread class - it has run() method and in this method it does not have any task
*/
class Abc5 extends Thread {
    // output is nothing

    // need to do
    // @Override
    // public void run() {
    //      System.out.println("hi");
    // }
}

public class Test5 {
    public static void main(String[] args) {
        Abc5 ob1 = new Abc5();
        ob1.start();
    }
}


/*
    This is the flow

    - start() method is the method of the Thread class
    - it calls Thread class start() method
    - internally that start() method calls Thread class run() method (JVM creates a new thread and calls Thread.run())
    - that run() method calls run() method which we override in the Abc5 class (if we write)
    - Abc5 class inherit the Thread class, so we can override run() method
 */
