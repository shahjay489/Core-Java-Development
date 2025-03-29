package com.jayshah.chapter_8_Strings._4_String_Programs_1;

public class CountStringWords {
    public static void main(String[] args) {
        String str = "this is my first\n demo\t";

        int count = 0;

        boolean b = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\n') {
                b = true;
            } else if (b == true) {
                b = false;
                count++;
            }
        }

        System.out.println("Total number of words : " + count);
    }
}

/*

Note:

- words differentiate based on the spaces
- then increase count value and make that condition false

 */