package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception {
        String str = "this is demo......!!!!!";

        FileWriter fw = new FileWriter("E:\\javaio\\bbb.txt");
        fw.write(str);

        fw.close();
    }
}
