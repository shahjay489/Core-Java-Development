package com.jayshah.chapter_10_Java_InputOutput_Serialization._4_Character_Stream_Classes.CharStreamClassesDemo;

import java.io.CharArrayReader;

public class CharArrayReaderDemo {
    public static void main(String[] args) throws Exception {
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        CharArrayReader car = new CharArrayReader(ch);

        int i;
        while ((i = car.read()) != -1) {
            System.out.print((char) i);
        }

        car.close();
    }
}
