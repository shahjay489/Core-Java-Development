package com.jayshah.chapter_16_Java8_Features._6.demoOld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date d0 = new Date();
        System.out.println(d0);

        Date d = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");
        String current_date = sdf1.format(d);
        System.out.println(current_date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String current_time = sdf2.format(d);
        System.out.println(current_time);
    }
}


/*
    mm : minutes
    MM : month

    hh : 12 hrs format
    HH : 24 hrs format
 */