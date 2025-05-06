package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {

        // this will create only one folder
        File f = new File("E:\\javafiles\\aaa");
        if (f.mkdirs()) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

        // for creating folder/folder/folder then need to use mkdirs()
        File f2 = new File("E:\\javafiles\\fol1\\fol2\\fol3");
        if (f2.mkdirs()) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
}
