package com.jayshah.chapter_8_Strings._4_String_Programs_1;

public class MinOccurringChar {
    public static void main(String[] args) {
        String str = "adbccbdcddcc";

        //str = str.replaceAll("\\s", ""); // to replace spaces

        int[] arr = new int[126];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        int min = str.length();  // we set min value as highest value of the length of the sting
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (min > arr[str.charAt(i)]) {
                min = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }

        System.out.println("Minimum repeated character is : " + c);
    }
}