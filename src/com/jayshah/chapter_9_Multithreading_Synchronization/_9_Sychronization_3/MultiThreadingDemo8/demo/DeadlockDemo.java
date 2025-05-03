package com.jayshah.chapter_9_Multithreading_Synchronization._9_Sychronization_3.MultiThreadingDemo8.demo;

class Resource {

}

class MyThread1 extends Thread {
    Resource res1, res2;

    MyThread1(Resource res1, Resource res2) {
        this.res1 = res1;
        this.res2 = res2;
    }

    public void run() {
        synchronized (res1) {
            System.out.println("Thread 1 has allocated resource 1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            synchronized (res2) {
                System.out.println("Thread 1 has allocated resource 2");
            }
        }
    }
}

class MyThread2 extends Thread {
    Resource res1, res2;

    MyThread2(Resource res1, Resource res2) {
        this.res1 = res1;
        this.res2 = res2;
    }

    public void run() {
        synchronized (res2) {
            System.out.println("Thread 2 has allocated resource 2");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            synchronized (res1) {
                System.out.println("Thread 2 has allocated resource 1");
            }
        }
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource res1 = new Resource();
        Resource res2 = new Resource();

        MyThread1 t1 = new MyThread1(res1, res2);
        t1.start();

        MyThread2 t2 = new MyThread2(res1, res2);
        t2.start();
    }
}
