package com.jayshah.chapter_8_Strings._5_String_Programs_2;

import java.util.Arrays;

public class RemAllDuplicates {
    public static void main(String[] args) {

        String str = "Govardhan java";

        char[] ch = str.toCharArray();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    break;
                }
            }
            if (i == j) {
                ch[count] = ch[i];
                count++;    // count increment only possible when the duplicate value not found
            }
        }
        System.out.println(ch);
//        while(count<str.length())
//        {
//            ch[count]=' ';
//            count++;
//        }
//        System.out.println(ch);


        // here in this way, we hava count value
        // we just store up to that count value (taking from the index position)
        // so rest of the things will not be print
        String newstr = String.valueOf(Arrays.copyOf(ch, count));   // predefine method of the String
        System.out.println(newstr);
    }

}
