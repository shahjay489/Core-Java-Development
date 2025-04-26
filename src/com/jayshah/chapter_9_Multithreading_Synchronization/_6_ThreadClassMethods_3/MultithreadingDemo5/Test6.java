package com.jayshah.chapter_9_Multithreading_Synchronization._6_ThreadClassMethods_3.MultithreadingDemo5;

class MyThread6 extends Thread
{
    public void run()
    {
        System.out.println("Is thread interrupted (1) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());

         /*
            difference :

            -> Thread.interrupted()
                - this method check the status and return it.
                - also, it changes from true to false
                - but it can not change from false to true

            -> Thread.currentThread().isInterrupted()
                - this method just check the status
                - for calling this method we need Thread class with current thread
          */


        //System.out.println("Is thread interrupted (1) : "+Thread.currentThread().isInterrupted());
        //System.out.println("Is thread interrupted (2) : "+Thread.currentThread().isInterrupted());
    }
}
public class Test6
{
    public static void main(String[] args)
    {
        MyThread6 mt=new MyThread6();
        mt.start();
        
        mt.interrupt();
    }
}