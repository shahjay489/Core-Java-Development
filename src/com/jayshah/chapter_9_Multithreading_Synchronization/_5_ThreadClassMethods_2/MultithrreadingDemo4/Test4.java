package com.jayshah.chapter_9_Multithreading_Synchronization._5_ThreadClassMethods_2.MultithrreadingDemo4;

class MyThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        MyThread4 mt4 = new MyThread4();
        mt4.start();

        Thread.yield();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
        }
    }
}
