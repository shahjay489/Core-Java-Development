package com.jayshah.chapter_9_Multithreading_Synchronization._11_Callable_Future_intf_ThreadLocal.callabledemo;

class ThreadTask3 implements Runnable {
    ThreadLocal tl = new ThreadLocal();

    public void run() {
        tl.set("Govardhan");

        //System.out.println("hi : "+tl.get());
        display();
    }

    void display() {
        System.out.println("hi : " + tl.get());
        tl.remove();
        System.out.println("hi : " + tl.get());
    }
}

public class Test3 {
    public static void main(String[] args) {
        ThreadTask3 tt = new ThreadTask3();

        Thread t = new Thread(tt);
        t.start();
    }
}
