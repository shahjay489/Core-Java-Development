package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.StringWriter;

public class StringWriterDemo {
    public static void main(String[] args) throws Exception {
        StringWriter sw = new StringWriter();
        sw.write("this is demo part");

        System.out.println(sw);
    }
}

/*
    here, sw is a character stream,
    when you print character stream that it will print directly the stream which you gave.

 */
