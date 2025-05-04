package com.jayshah.chapter_10_Java_InputOutput_Serialization._3_Byte_Stream_Classes.inputoutputstreamsdemo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        String str = "this is dmeo...!!";

        FileOutputStream fos1 = new FileOutputStream("E:\\aaa.txt");
        FileOutputStream fos2 = new FileOutputStream("E:\\bbb.txt");

        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        ba.write(str.getBytes());

        ba.writeTo(fos1);
        ba.writeTo(fos2);
    }
}
