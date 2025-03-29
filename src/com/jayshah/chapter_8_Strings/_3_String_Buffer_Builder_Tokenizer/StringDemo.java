package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer;

class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("Govardhan");
        String str2 = new String("Govardhan");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String name1 = "Dwarkesh";
        String name2 = "Dwarkesh";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}