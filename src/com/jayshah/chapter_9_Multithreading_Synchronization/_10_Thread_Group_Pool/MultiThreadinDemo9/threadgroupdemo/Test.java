package com.jayshah.chapter_9_Multithreading_Synchronization._10_Thread_Group_Pool.MultiThreadinDemo9.threadgroupdemo;

public class Test {
    public static void main(String[] args) {
        String name = Thread.currentThread().getThreadGroup().getName();
        System.out.println("Current thread-group name : " + name);

        String parent_name = Thread.currentThread().getThreadGroup().getParent().getName();
        System.out.println("Parent thread-group name : " + parent_name);
    }
}
