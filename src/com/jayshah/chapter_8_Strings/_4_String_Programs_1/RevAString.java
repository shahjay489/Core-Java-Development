package com.jayshah.chapter_8_Strings._4_String_Programs_1;

public class RevAString {
    public static void main(String[] args) {
        String name = "Govardhan";

        int length = name.length();
        String rev = "";

        for (int i = length - 1; i >= 0; i--) {
            //System.out.println(name.charAt(i));
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}

/*
Note:
- String works based on the index
- String Traverse : Last : length () method - 1 => gives last index position
- get each and every character using charAt() method

 */