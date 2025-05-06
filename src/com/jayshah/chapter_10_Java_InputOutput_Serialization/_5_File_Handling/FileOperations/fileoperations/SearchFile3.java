package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;
import java.io.FilenameFilter;

public class SearchFile3 {
    public static void main(String[] args) {
        File f = new File("E:\\javabatch\\");

        String[] str = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //return name.startsWith("M");
                return name.endsWith("java");
            }
        });

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}

/*
    compare to SearchFile2 program,
    here we are not creating new class,
    we directly use and override the method.
    just try to write new FilenameFilter() and hit enter
    it will override method automatically.
 */