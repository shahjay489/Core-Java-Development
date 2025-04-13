
package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingDemo;

class PlayVideo2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Video is playing");
        }
    }
}

class PlaySound2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Sound is executing");
        }
    }
}

public class Vlc2 {
    public static void main(String[] args) {
        PlayVideo2 pv = new PlayVideo2();
        pv.start();

        PlaySound2 ps = new PlaySound2();
        ps.start();
    }
}

/*
    See the output:
    - everytime you can see the different output
 */