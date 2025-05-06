package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\javafiles\\aaa.txt");

        if (f.createNewFile()) {
            System.out.println("file created successfully");
        } else {
            System.out.println("file not created due to some error");
        }

//        boolean b = f.createNewFile();
//        if (b) {
//            System.out.println("file created successfully");
//        } else {
//            System.out.println("file not created sue to some error");
//        }
    }
}

/*
    if file already exist then it will not override.
    as per our cod\ing, it will go in else part.
 */
