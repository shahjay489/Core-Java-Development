package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;
import java.io.FilenameFilter;

class MyFilter implements FilenameFilter {
    String n;

    MyFilter(String n) {
        this.n = n;
    }

    // override method of the FilenameFilter interface
    public boolean accept(File dir, String name) {
        //return name.startsWith(n);
        return name.endsWith(n);
    }
    // here you need to make public because it requires bigger access modifier.

}

public class SearchFile2 {
    public static void main(String[] args) {
        File f = new File("E:\\javabatch\\");

        MyFilter mf = new MyFilter("java");

        String[] str = f.list(mf);

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
