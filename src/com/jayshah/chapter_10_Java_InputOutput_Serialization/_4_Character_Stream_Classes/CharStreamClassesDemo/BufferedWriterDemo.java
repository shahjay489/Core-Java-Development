package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("E:\\javaio\\ccc.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("this is Govardhan demo...!!");

        bw.close();
        fw.close();
    }
}
