package com.jayshah.chapter_10_Java_InputOutput_Serialization._1_Java_IO_Intro_Byte_Stream.JavaIoDemo.CopyFIle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {
        String sourcePath = "src/com/jayshah/chapter_10_Java_InputOutput_Serialization/_1_Java_IO_Intro_Byte_Stream/JavaIoDemo/CopyFIle/read.txt";
        String destinationPath = "src/com/jayshah/chapter_10_Java_InputOutput_Serialization/_1_Java_IO_Intro_Byte_Stream/JavaIoDemo/CopyFIle/copiedData.txt";

        try (
                FileInputStream fis = new FileInputStream(sourcePath);
                FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i); // Write each byte to the destination file
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
