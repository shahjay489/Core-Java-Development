package com.jayshah.chapter_9_Multithreading_Synchronization._3_ThreadCreation_2.MultithreadingDemo2;

/*

#### By using "Runnable" interface :-
- Steps to create thread using "Runnable" interface :-
    1. inherits the "Runnable" interface
    2. override the run() method
    3. create an instance of the class
    4. create an instance of Thread class and pass the above class instance in thread class constructor
    5. start the thread

*/
class MyThread1 implements Runnable {   // 1. inherits the "Runnable" interface
    @Override
    public void run() {         // 2. override the run() method
        for (int i = 1; i <= 10; i++) {
            System.out.println("child thread : " + i);
        }
    }

    void show() {
        System.out.println("hi");
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();    // 3. create an instance of the class
        Thread t = new Thread(mt1);     // 4. create an instance of Thread class and pass the above class instance in thread class constructor

//        mt1.start();  // error

        t.start();      // 5. start the thread through Thread class
        // t.start()  thread 0 will execute this


        for (int i = 1; i <= 10; i++) {
            System.out.println("main thread : " + i);
        }

        mt1.show();     // main thread execute this
    }
}


/*

      mt1.start();  // error

      why error?
     - There is no start() method in the MyThread1 class
     - Or there is not in the Runnable interface
     - start() method is in the Thread class that is why we need to call through Thread class
 */