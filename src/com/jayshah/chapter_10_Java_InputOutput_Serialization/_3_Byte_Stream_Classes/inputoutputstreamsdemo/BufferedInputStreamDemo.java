package com.jayshah.chapter_10_Java_InputOutput_Serialization._3_Byte_Stream_Classes.inputoutputstreamsdemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:\\aaa.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int i;
        while ((i = bis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
        bis.close();
    }
}
