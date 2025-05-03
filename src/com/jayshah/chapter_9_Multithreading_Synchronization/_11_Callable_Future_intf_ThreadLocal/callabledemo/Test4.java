package com.jayshah.chapter_9_Multithreading_Synchronization._11_Callable_Future_intf_ThreadLocal.callabledemo;

class ThreadTask4 implements Runnable {

    ThreadLocal tl;

    public ThreadTask4(ThreadLocal tl) {
        this.tl = tl;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + tl.get());
    }

}

public class Test4 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        tl.set(100);

        System.out.println(Thread.currentThread().getName() + " : " + tl.get());

        ThreadTask4 tt = new ThreadTask4(tl);

        Thread t = new Thread(tt);
        t.start();
    }
}


/*
    The value is set for the main thread.
    So, whenever main thread calls you will get the value
    but, if you call another thread for the same value then it is not  possible.
 */