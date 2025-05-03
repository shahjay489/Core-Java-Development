package com.jayshah.chapter_9_Multithreading_Synchronization._9_Sychronization_3.MultiThreadingDemo8.newsync;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock; // click on Lock interface and see different methods

class BookTicket {

    ReentrantLock re = new ReentrantLock();

    int total_seats = 10;

    void bookTicket(int seats) {
        re.lock();
        re.lock();
        re.lock();

        if (total_seats >= seats) {
            System.out.println("success");
            total_seats = total_seats - seats;
            System.out.println("seats left : " + total_seats);
        } else {
            System.err.println("fail");
        }

        try {
            System.out.println("-----------------------");
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }

        re.unlock();

        m1();

    }

    void m1() {
        System.out.println("hiiiiiiiii");

        re.unlock();
        re.unlock();
    }
}

class MyThread1 extends Thread {
    BookTicket bt;
    int seats;

    MyThread1(BookTicket bt, int seats) {
        this.bt = bt;
        this.seats = seats;
    }

    public void run() {
        bt.bookTicket(seats);
    }
}

class MyThread2 extends Thread {
    BookTicket bt;
    int seats;

    MyThread2(BookTicket bt, int seats) {
        this.bt = bt;
        this.seats = seats;
    }

    public void run() {
        bt.bookTicket(seats);
    }
}

public class Test1 {
    public static void main(String[] args) {
        BookTicket bt1 = new BookTicket();

        MyThread1 t1 = new MyThread1(bt1, 7);
        t1.start();

        MyThread1 t2 = new MyThread1(bt1, 4);
        t2.start();
    }
}