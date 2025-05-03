package com.jayshah.chapter_9_Multithreading_Synchronization._10_Thread_Group_Pool.MultiThreadinDemo9.threadgroupdemo;

public class Test2 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("main-sub-thread-group");

        Thread t1 = new Thread(tg, "Govardhan thread");
        Thread t2 = new Thread(tg, "Giriraj thread");

        System.out.println("Current thread-group name : " + tg.getName());
        System.out.println("Parent thread-group name : " + tg.getParent().getName());

        System.out.println("Old priority of thread-group : " + tg.getMaxPriority());
        tg.setMaxPriority(7);
        System.out.println("New priority of thread-group : " + tg.getMaxPriority());

        tg.list();  // it will print the thread-group information
    }
}

/*
    priority : default : thread - 5
                       : thread group - 10
 */