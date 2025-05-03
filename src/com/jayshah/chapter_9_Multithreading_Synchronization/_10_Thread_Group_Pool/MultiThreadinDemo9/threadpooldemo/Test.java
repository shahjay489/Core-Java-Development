package com.jayshah.chapter_9_Multithreading_Synchronization._10_Thread_Group_Pool.MultiThreadinDemo9.threadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Test
{
    public static void main(String[] args)
    {
        MyThreadTask mt=new MyThreadTask();
//        Thread t=new Thread(mt);
//        t.start();
        
        ExecutorService es= Executors.newFixedThreadPool(10);

        es.submit(mt);
        // or
        es.shutdown();
    }
}
