package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterDemo {
    public static void main(String[] args) throws Exception {
        CharArrayWriter car = new CharArrayWriter();
        car.write("this is char array writer demo...!!");

        FileWriter fw1 = new FileWriter("E:\\javaio\\f1.txt");
        FileWriter fw2 = new FileWriter("E:\\javaio\\f2.txt");
        FileWriter fw3 = new FileWriter("E:\\javaio\\f3.txt");

        car.writeTo(fw1);
        car.writeTo(fw2);
        car.writeTo(fw3);

        fw1.close();
        fw2.close();
        fw3.close();
    }
}

/*
    In this case, internal working of close() method ius different,
    if you do not close it then it will not write,
    because it assumes next data is coming into the stream.
*/
