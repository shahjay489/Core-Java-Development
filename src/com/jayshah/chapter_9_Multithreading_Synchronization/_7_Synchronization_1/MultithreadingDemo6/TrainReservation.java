package com.jayshah.chapter_9_Multithreading_Synchronization._7_Synchronization_1.MultithreadingDemo6;

class BookTrainSeat {
    int total_seats = 10;

    synchronized void bookSeat(int seats, String name) {
        if (total_seats >= seats) {
            System.out.println(name + " booked " + seats + " seats successfully");
            total_seats = total_seats - seats;
            System.out.println("Total seats left : " + total_seats);
        } else {
            System.err.println(name + " sorry...!! seats not left");
            System.err.println("Total seats left : " + total_seats);
        }
    }
}

class MyThreadTrain extends Thread {
    BookTrainSeat bts;
    int seats;

    public MyThreadTrain(BookTrainSeat bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    public void run() {
        bts.bookSeat(seats, Thread.currentThread().getName());
    }
}

public class TrainReservation {
    public static void main(String[] args) {
        BookTrainSeat bts = new BookTrainSeat();

        MyThreadTrain govardhan = new MyThreadTrain(bts, 5);
        govardhan.setName("Govardhan");
        govardhan.start();

        MyThreadTrain dwarkesh = new MyThreadTrain(bts, 3);
        dwarkesh.setName("Dwarkesh");
        dwarkesh.start();

        MyThreadTrain giriraj = new MyThreadTrain(bts, 4);
        giriraj.setName("Giriraj");
        giriraj.start();
    }
}
