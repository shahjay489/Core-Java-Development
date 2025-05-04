package com.jayshah.chapter_10_Java_InputOutput_Serialization._1_Java_IO_Intro_Byte_Stream.JavaIoDemo.outputstreamdemo;

import java.io.FileOutputStream;

public class WriteData {
    public static void main(String[] args) {
        try {
            String data = "this is my first demo...!!";

//            FileOutputStream fos = new FileOutputStream("e:\\aaa.txt");
            FileOutputStream fos = new FileOutputStream("src/com/jayshah/chapter_10_Java_InputOutput_Serialization/_1_Java_IO_Intro_Byte_Stream/JavaIoDemo/outputstreamdemo/aaa.txt");
            byte[] b = data.getBytes();
            fos.write(b);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
    FileOutputStream fos = new FileOutputStream("src/com/jayshah/chapter_10_Java_InputOutput_Serialization/_1_Java_IO_Intro_Byte_Stream/JavaIoDemo/outputstreamdemo/aaa.txt", true);

    -> when you arite true then it will add new detail in the file
    -> by default false | or you write false : then it will over written on same file means - old data will be lost.

 */