package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;

public class GetFileSize {
    public static void main(String[] args) {
        File f = new File("E:\\javafiles\\aaa.txt");
        long l = f.length();
        System.out.println(l);

        long ll = f.lastModified();
        System.out.println(ll);

        System.out.println(f.isFile());
    }
}
