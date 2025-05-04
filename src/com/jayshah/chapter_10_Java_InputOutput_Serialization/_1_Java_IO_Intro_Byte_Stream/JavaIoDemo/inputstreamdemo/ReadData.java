package com.jayshah.chapter_10_Java_InputOutput_Serialization._1_Java_IO_Intro_Byte_Stream.JavaIoDemo.inputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData
{
    public static void main(String[] args)
    {
        try
        {
            // FileInputStream fis=new FileInputStream("E:\\javabatch\\PackageDemo.java");
            FileInputStream fis=new FileInputStream("src/com/jayshah/chapter_10_Java_InputOutput_Serialization/_1_Java_IO_Intro_Byte_Stream/JavaIoDemo/inputstreamdemo/ReadData.java");
            int i;
            while( (i=fis.read()) != -1 )
            {
                System.out.print((char)i);
            }
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}

/*
    close() method write in the try-catch block.
 */