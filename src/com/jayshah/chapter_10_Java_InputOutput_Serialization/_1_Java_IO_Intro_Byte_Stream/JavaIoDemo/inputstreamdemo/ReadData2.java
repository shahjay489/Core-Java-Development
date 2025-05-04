package com.jayshah.chapter_10_Java_InputOutput_Serialization._1_Java_IO_Intro_Byte_Stream.JavaIoDemo.inputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData2 {
    public static void main(String[] args) {
        try (
                // FileInputStream fis=new FileInputStream("E:\\javabatch\\PackageDemo.java");
                FileInputStream fis = new FileInputStream("src/com/jayshah/chapter_10_Java_InputOutput_Serialization/_1_Java_IO_Intro_Byte_Stream/JavaIoDemo/inputstreamdemo/ReadData1.java");
        ) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

/*
    here we use try with resources,
    so we do not require to close in the finally block
    it closes automatically
    and our code is not going to be lengthy.
 */