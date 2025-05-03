package com.jayshah.chapter_9_Multithreading_Synchronization._11_Callable_Future_intf_ThreadLocal.callabledemo;

class ThreadTask implements Runnable {
    public void run() {
        System.out.println("hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        ThreadTask tt = new ThreadTask();

        Thread t1 = new Thread(tt);
        t1.start();
    }
}

/*
    Here, in Runnable
    once thread task complete then it will go in the dead state.
    It will not return anything. As you can see void return type.

    But, you want to return,
    then you need to use the Callable interface.
 */