package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.StringReader;

public class StringReaderDemo {
    public static void main(String[] args) throws Exception {
        StringReader sr = new StringReader("this is string reader demo");

        int i;
        while ((i = sr.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
