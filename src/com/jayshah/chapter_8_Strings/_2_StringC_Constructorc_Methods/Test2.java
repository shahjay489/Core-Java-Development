package com.jayshah.chapter_8_Strings._2_StringC_Constructorc_Methods;

public class Test2 {
    public static void main(String[] args) {
        String str1 = new String("Govardhan");
        System.out.println(str1.length());

        String str2 = "Govardhan";

        int leng = str2.length(); // always return in integer

        System.out.println(str2.length());

        System.out.println(str2.isEmpty());

        String str = "           Govardhan                Dwarkesh           ";
        System.out.println(str.trim()); // remove spaces at start and point
        // center spaces can not remove
    }
}
