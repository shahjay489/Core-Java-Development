package com.jayshah.chapter_16_Java8_Features._6.demoNew;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Duration
 */
public class Test7 {
    public static void main(String[] args) {
        Duration d = Duration.ofHours(1);
        System.out.println(d.getSeconds());


        Duration d1 = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(d1.getSeconds());
    }
}
