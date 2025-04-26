package com.jayshah.chapter_9_Multithreading_Synchronization._5_ThreadClassMethods_2.MultithrreadingDemo4;

/*
    Here, in this example
    We want main thread must execute and child thread should wait
    So, we write join() method in the child thread i.e. MyThread2 class
    then, we need the reference of the Main thread class
    so we make one constructor and pass the
 */
class MyThread6 extends Thread {

    /*
        here we can write this

        Thread t = Thread.currentThread();

        So, it will give the reference of the main class thread

        Similarly, we just pass reference through constructor.
     */
    Thread t;

    MyThread6(Thread t) {
        this.t = t;
    }

    public void run() {
        try {
            t.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Test6 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        MyThread6 mt = new MyThread6(t);
        mt.start();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
