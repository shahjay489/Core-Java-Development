package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
        String str1 = "this is outputstreamwriter class demo..!!";
        char[] str2 = {'a', 'b', 'c', 'd', 'e'};

        FileOutputStream fos = new FileOutputStream("E:\\javaio\\xyz2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.write(str2);    // str1

        osw.close();
    }
}
