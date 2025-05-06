package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;

public class SearchFile1 {
    public static void main(String[] args) {
        File f = new File("E:\\javabatch\\");
        String[] str = f.list();
        for (int i = 0; i < str.length; i++) {  // OR for (String s : str) {..}
            System.out.println(str[i]);
        }
    }
}
