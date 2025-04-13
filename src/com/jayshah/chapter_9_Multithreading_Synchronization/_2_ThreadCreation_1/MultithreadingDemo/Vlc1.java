package com.jayshah.chapter_9_Multithreading_Synchronization._2_ThreadCreation_1.MultithreadingDemo;

class PlayVideo {
    void executeVideo() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Video is playing");
        }
    }
}

class PlaySound {
    void executeSound() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Sound is executing");
        }
    }
}

public class Vlc1 {
    public static void main(String[] args) {
        PlayVideo pv = new PlayVideo();
        pv.executeVideo();

        PlaySound ps = new PlaySound();
        ps.executeSound();
    }
}

/*

        Execution flow
    -------------------------------
    - 1st main method
    - 2nd PlayVideo
    - 3rd PlaySound

    - The flow should be same all the times,
        no matter how many times you run the program.

    Note:
        - Methods never execute together
        - at the staring main() method execute it calls different method
        - first finish the 1st method then it comes back
        - ten it calls 2nd method and finish it then come back
        - then 3rd .... like that

        - Also, if 1st method takes 1 hour
        - then 2nd method wait till finish the 1st method
        - when 2nd method takes 1 hour then it takes 1 hour
        - overall, 2 hours takes this VLC program to play video

    - but if you make both method as thread then both are execute together
    - parallel execution

    - When you need to execute multiple-task together then in this case we use Multithreading.

 */
