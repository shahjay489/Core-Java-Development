package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\\javaio\\aaa.txt");

        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

        fr.close();
    }
}
