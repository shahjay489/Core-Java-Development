package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\\javaio\\aaa.txt");
        BufferedReader bf = new BufferedReader(fr);

        int i;
        while ((i = bf.read()) != -1) {
            System.out.print((char) i);
        }

        bf.close();
        fr.close();
    }
}