package com.jayshah.chapter_9_Multithreading_Synchronization._7_Synchronization_1.MultithreadingDemo6;

class BookTrainSeat2 {
    int total_seats = 10;

    void bookSeat(int seats, String name) {
        //1000 lines of code
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(name + " booked " + seats + " seats successfully");
                total_seats = total_seats - seats;
                System.out.println("Total seats left : " + total_seats);
            } else {
                System.err.println(name + " sorry...!! seats not left");
                System.err.println("Total seats left : " + total_seats);
            }
        }


        //1000 lines of code
    }
}

class MyThreadTrain2 extends Thread {
    BookTrainSeat2 bts;
    int seats;

    public MyThreadTrain2(BookTrainSeat2 bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    public void run() {
        bts.bookSeat(seats, Thread.currentThread().getName());
    }
}

public class TrainReservation2 {
    public static void main(String[] args) {
        BookTrainSeat2 bts = new BookTrainSeat2();

        MyThreadTrain2 deepak = new MyThreadTrain2(bts, 5);
        deepak.setName("Govardhan");
        deepak.start();

        MyThreadTrain2 amit = new MyThreadTrain2(bts, 3);
        amit.setName("Dwarkesh");
        amit.start();

        MyThreadTrain2 rahul = new MyThreadTrain2(bts, 4);
        rahul.setName("Giriraj");
        rahul.start();
    }
}