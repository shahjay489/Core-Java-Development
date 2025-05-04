package com.jayshah.chapter_10_Java_InputOutput_Serialization._3_Byte_Stream_Classes.inputoutputstreamsdemo;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        String str = "this is demo";

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        pos.write(str.getBytes());

        int i;
        while ((i = pis.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
