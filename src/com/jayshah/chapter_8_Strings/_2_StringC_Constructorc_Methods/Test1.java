package com.jayshah.chapter_8_Strings._2_StringC_Constructorc_Methods;

public class Test1 {
    public static void main(String[] args) {
        String str1 = new String("Govardhan");
        System.out.println(str1);

        byte[] b = {97, 98, 99, 100};
        String str2 = new String(b);
        System.out.println(str2);   // character will be printed

        char[] c = {'a', 'b'};
        String str3 = new String(c);
        System.out.println(str3);
    }
}
