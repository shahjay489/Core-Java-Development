package com.jayshah.chapter_9_Multithreading_Synchronization._10_Thread_Group_Pool.MultiThreadinDemo9.threadgroupdemo;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
        System.out.println(Thread.currentThread().getPriority());

        //---------------------------------------------------------------------------------

        ThreadGroup tg = new ThreadGroup("sub-tg");

        Thread t1 = new Thread(tg, "Govardhan thread");
        t1.start();

        Thread t2 = new Thread(tg, "Giriraj thread");
        t2.start();

        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());

        tg.setMaxPriority(7);

        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());

        ThreadGroup sub_tg = new ThreadGroup(tg, "sub-sub-tg");
        System.out.println("sub-sub-tg: " + sub_tg.getMaxPriority());

        Thread t3 = new Thread(tg, "Dwarkesh thread - from tg");
        t3.start();
        System.out.println(t3.getPriority());

        Thread t4 = new Thread(sub_tg, "Dwarkesh thread - from sub_tg");
        t4.start();
        System.out.println(t3.getPriority());
    }
}
