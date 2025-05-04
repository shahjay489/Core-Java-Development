package com.jayshah.chapter_10_Java_InputOutput_Serialization._3_Byte_Stream_Classes.inputoutputstreamsdemo;

import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("E:\\ddd.txt");
        ps.println("hello Govardhan");
        ps.print(100);
        ps.println("demo");
        ps.close();

        System.out.print("hello");
    }
}

/*
    Main thread will never terminate, you have to do it manually.
    Because we pass data from one thread to another thread.
 */