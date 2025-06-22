package com.jayshah.chapter_16_Java8_Features._6.demoNew;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Time related methods
 */
public class Test2 {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1); // hrs:min:sec.nanoSec

        //-----------------------------------------------------
        LocalTime lt2 = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        String current_time = lt2.format(dtf);
        System.out.println(current_time);
        // OR
        String current_time1 = dtf.format(lt2);
        System.out.println(current_time1);

        //--------------------------------------------------------
        LocalTime lt = LocalTime.now();
        System.out.println(lt.getHour());
        System.out.println(lt.minusHours(40));
    }
}
