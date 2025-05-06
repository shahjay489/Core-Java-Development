package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;

public class ReadOnlyDemo {
    public static void main(String[] args) {
        File f = new File("E:\\javafiles\\aaa.txt");

        if (f.setReadOnly()) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

        System.out.println("------------------------------------");

        System.out.println("File can be read : " + f.canRead());
        System.out.println("File can be write : " + f.canWrite());
    }
}
