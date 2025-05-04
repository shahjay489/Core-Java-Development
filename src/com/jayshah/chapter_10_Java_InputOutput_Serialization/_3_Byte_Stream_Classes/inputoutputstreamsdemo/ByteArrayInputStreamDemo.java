package com.jayshah.chapter_10_Java_InputOutput_Serialization._3_Byte_Stream_Classes.inputoutputstreamsdemo;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String str = "this is demo";
        byte[] b = str.getBytes();
        ByteArrayInputStream ba = new ByteArrayInputStream(b);
        int i;
        while ((i = ba.read()) != -1) {
            System.out.print((char) i);
        }
    }
}