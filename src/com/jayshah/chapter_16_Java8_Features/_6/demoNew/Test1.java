package com.jayshah.chapter_16_Java8_Features._6.demoNew;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Date related methods
 */
public class Test1 {
    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.now();  //yyyy-MM-dd : predefine format
        System.out.println(ld1);


        //----------------------------------------------------------
        LocalDate ld2 = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String current_date = ld2.format(dtf);
        System.out.println(current_date);
        // OR
        String current_date2 = dtf.format(ld2);
        System.out.println(current_date2);


        //-----------------------------------------------------------
        String selected_date = "01-Jan-1990";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
        LocalDate ld3 = LocalDate.parse(selected_date, dtf2);   //yyyy-MM-dd
        System.out.println(ld3);

        //------------------------------------------------------------
        LocalDate ld4 = LocalDate.now();
        System.out.println(ld4.getDayOfMonth());
        System.out.println(ld4.isLeapYear());

        LocalDate ldnew = ld4.minusDays(9);
        System.out.println(ldnew);

        LocalDate ldnew1 = ld4.plusMonths(7);
        System.out.println(ldnew1);


        //-------------------------------------------------------------
        LocalDate ld = LocalDate.of(2020, 01, 01);
        System.out.println(ld.isLeapYear());
    }
}
