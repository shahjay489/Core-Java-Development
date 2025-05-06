package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\javafiles\\aaa.txt");
        File f2 = new File("E:\\javafiles\\bbb.txt");

        if (f1.renameTo(f2)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
}
