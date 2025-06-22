package com.jayshah.chapter_16_Java8_Features._6.demoNew;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

/**
 * Get time according to Zone
 */
public class Test4 {
    public static void main(String[] args) {
        ZoneId zi1 = ZoneId.of("America/New_York");

        LocalDate ld1 = LocalDate.now(zi1);
        System.out.println(ld1);

        LocalTime lt1 = LocalTime.now(zi1);
        System.out.println(lt1);

        //---------------------------------------------------------
        LocalTime indian_time = LocalTime.now();

        ZoneId zi = ZoneId.of("America/New_York");
        LocalTime america_time = LocalTime.now(zi);

        long l = ChronoUnit.HOURS.between(america_time, indian_time);
        System.out.println(l);

        //------------------------------------------------------------
        String[] arr= TimeZone.getAvailableIDs();
        for (String a : arr) {
            System.out.println(a);
        }

        //-----------------------------------------------------------
        Clock c = Clock.systemDefaultZone();
        System.out.println(c);
    }
}
