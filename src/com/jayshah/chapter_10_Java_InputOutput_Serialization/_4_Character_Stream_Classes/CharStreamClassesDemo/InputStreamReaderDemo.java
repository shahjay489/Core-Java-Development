package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:\\javaio\\aaa.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        int i;
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);
        }

        fis.close();
        isr.close();
    }
}


/*
    try to make object of this InputStreamReader,

    InputStreamReader is a abstract class,
    so we can not make object of the abstract class,
    but if we try to make it then it will automatically override
    the method.

    So, if you forget this is abstract class then how will you know that?
    - When you face similar situation automatically override the method
     in this case remember it is an abstract class.

    - Netbeans IDE : this is happened
 */