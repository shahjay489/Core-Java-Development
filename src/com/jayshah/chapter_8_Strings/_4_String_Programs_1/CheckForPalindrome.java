package com.jayshah.chapter_8_Strings._4_String_Programs_1;

public class CheckForPalindrome {
    public static void main(String[] args) {
        String str = "abcba";

        int length = str.length();
        String rev = "";

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}

/*

Note:

- do reverse string
- then compare both strings

 */