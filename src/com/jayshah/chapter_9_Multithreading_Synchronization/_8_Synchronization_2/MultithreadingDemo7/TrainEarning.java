package com.jayshah.chapter_9_Multithreading_Synchronization._8_Synchronization_2.MultithreadingDemo7;

class TicketEarning extends Thread {
    int total_earning = 0;
    int ticket_price = 100;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total_earning = total_earning + ticket_price;
            }
            this.notify();
        }
    }
}

public class TrainEarning {
    public static void main(String[] args) throws Exception {
        TicketEarning te = new TicketEarning();
        te.start();

        synchronized (te) {
            te.wait();
            System.out.println("Total earnings : " + te.total_earning);
        }
    }
}


/*

public class TrainEarning {
    public static void main(String[] args) throws Exception {
        TicketEarning te = new TicketEarning();
        te.start();
        Thread.sleep(1000);
        System.out.println("Total earnings : " + te.total_earning);
    }
}

-->  Thread.sleep(1000); will give the result
        but, this is not a right option
        because if thread complete its task less than 1000 ms then?
        it supposes to be wait - which is not acceptable to waste time

 */