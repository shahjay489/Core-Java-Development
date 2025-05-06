package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.randomaccessdemo;

import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("E:\\javafiles\\aaa.txt", "r");
        //raf.seek();
    }
}

/*
    raf.seek()

    seek() method set the position for reading the file anywhere from the file.


 */