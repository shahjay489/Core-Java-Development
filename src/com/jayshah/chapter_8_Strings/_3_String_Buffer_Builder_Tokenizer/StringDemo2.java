package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer;

public class StringDemo2 {
    public static void main(String[] args) {

        // String object immutable
        String name = "Govardhan";
        name.concat("java");
        System.out.println(name);


        // String object mutable
        StringBuffer sb = new StringBuffer("Govardhan");
        sb.append("java");
        System.out.println(sb);

        System.out.println(sb.insert(3, "abc"));

                // ---------------------
        StringBuilder sbb = new StringBuilder("Govardhan");

    }
}