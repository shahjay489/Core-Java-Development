package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingDemo;

/**
 * When you run this program then see the output <br>
 * Try to run program multiple times <br>
 * So you can have an idea how output is changing <br>
 */

class MyThread extends Thread {
    @Override
    public void run() {
        // thread task
        for (int i = 1; i <= 10; i++) {
            System.out.println("child thread : " + i);
        }
    }
}

public class Test2 {
    public static void main(String[] args) {

        /* here in this way you can get different output
           because you do not have control on the "threads"
           that work is done by the thread scheduler
        */
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("main thread : " + i);
        }

        /* here in this way you can not get the different output
         because first main thread run, and it completes sout(print) 10 times in a loop then it comes here to call child thread

         - uncomment this and see the output
         - comment same thing before written on the "for" method
         */
//        MyThread t1 = new MyThread();
//        t1.start();t1
    }
}