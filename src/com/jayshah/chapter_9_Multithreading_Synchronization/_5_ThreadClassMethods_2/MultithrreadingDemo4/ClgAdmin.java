package com.jayshah.chapter_9_Multithreading_Synchronization._5_ThreadClassMethods_2.MultithrreadingDemo4;

class TakeAdmisn extends Thread {
    public void run() {
        try {
            System.out.println("Admisn starts");
            Thread.sleep(5000);
            System.out.println("You have taken the admisn successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class DepositFee extends Thread {
    public void run() {
        try {
            System.out.println("depositing fee");
            Thread.sleep(3000);
            System.out.println("You have deposit the fee successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TakeRollno extends Thread {
    public void run() {
        try {
            System.out.println("Take roll no");
            Thread.sleep(1000);
            System.out.println("Now you can sit in exams....!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ClgAdmin {
    public static void main(String[] args) throws InterruptedException {
        TakeAdmisn t1 = new TakeAdmisn();
        t1.start();

        t1.join();

        DepositFee t2 = new DepositFee();
        t2.start();

        t2.join();
//        t2.join(2000); // here you can give time also
        // if process not complete in this time then you can start other process

        TakeRollno t3 = new TakeRollno();
        t3.start();
    }
}
