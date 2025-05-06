package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.File;
import java.io.IOException;

public class GetSpaceInfo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\");

        long l = f1.getFreeSpace();
        System.out.println("Free space : " + l / (1024 * 1024 * 1024));

        long l2 = f1.getTotalSpace();
        System.out.println("Total space : " + l2 / (1024 * 1024 * 1024));
    }
}

/*

    1 kilobyte (KB) = 1024 bytes
    1 megabyte (MB) = 1024 kilobytes (KB)
    1 gigabyte (GB) = 1024 megabytes (MB)

 */