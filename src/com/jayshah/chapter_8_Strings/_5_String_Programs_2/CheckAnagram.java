package com.jayshah.chapter_8_Strings._5_String_Programs_2;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
//        String str1 = "keep";
//        String str2 = "Peek";

        String str1 = "car";
        String str2 = "arc";
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Two strings are anagram");
        } else {
            System.out.println("Two strings are not anagram");
        }
    }
}
