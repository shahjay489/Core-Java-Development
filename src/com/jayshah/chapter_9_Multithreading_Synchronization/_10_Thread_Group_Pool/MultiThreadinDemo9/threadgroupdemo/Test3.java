package com.jayshah.chapter_9_Multithreading_Synchronization._10_Thread_Group_Pool.MultiThreadinDemo9.threadgroupdemo;

public class Test3 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("main-sub-thread-group");

        Thread t1 = new Thread(tg, "Govardhan thread");
        Thread t2 = new Thread(tg, "Giriraj thread");

        t1.start();
        t2.start();

        System.out.println(tg.activeCount());   //2 threads are active
        System.out.println(tg.getParent().activeCount());   //1 threads are active

        System.out.println(tg.activeGroupCount());  //0
        System.out.println(tg.getParent().activeGroupCount());  //1
        System.out.println(tg.getParent().getParent().activeGroupCount());
    }
}
