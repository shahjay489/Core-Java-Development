package com.jayshah.chapter_9_Multithreading_Synchronization._5_ThreadClassMethods_2.MultithrreadingDemo4;

/*
    Here, in this example
    We want child thread must execute and main thread should wait

 */
class MyThread5 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
        MyThread5 mt = new MyThread5();
        mt.start();

        try {
            mt.join();  // this line will be executed by main thread, thus main thread will wait for another thread (Thread-0 - mt) to complete its task

            for (int i = 1; i <= 5; i++) {
                System.out.println("hello : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}