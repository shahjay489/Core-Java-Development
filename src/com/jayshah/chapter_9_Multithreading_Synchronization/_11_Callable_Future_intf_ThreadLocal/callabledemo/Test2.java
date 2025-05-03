package com.jayshah.chapter_9_Multithreading_Synchronization._11_Callable_Future_intf_ThreadLocal.callabledemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadTask2 implements Callable {
    public Object call() {
        int a = 10, b = 20, c;
        c = a + b;
        return c;
    }
}

public class Test2 {
    public static void main(String[] args) throws Exception {
        ThreadTask2 tt = new ThreadTask2();

        ExecutorService es = Executors.newFixedThreadPool(3);
        Future f = es.submit(tt);
        System.out.println(f.get());

        es.shutdown();
    }
}

/*
    execute() method always takes runnable value
    but you want to use callable
    then you need to use submit() method.

    both methods(execute() & submit()) are working same.
    What working? : Provide task/job to thread

    submit() method return the value in "future".
 */