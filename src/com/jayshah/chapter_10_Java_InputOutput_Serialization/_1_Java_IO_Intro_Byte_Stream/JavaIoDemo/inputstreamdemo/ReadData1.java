package com.jayshah.chapter_10_Java_InputOutput_Serialization._1_Java_IO_Intro_Byte_Stream.JavaIoDemo.inputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // FileInputStream fis=new FileInputStream("E:\\javabatch\\PackageDemo.java");
            fis = new FileInputStream("src/com/jayshah/chapter_10_Java_InputOutput_Serialization/_1_Java_IO_Intro_Byte_Stream/JavaIoDemo/inputstreamdemo/ReadData1.java");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
/*
    close() method write outside try-catch and in the finally block.
 */