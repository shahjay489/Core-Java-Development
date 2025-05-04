package com.jayshah.chapter_10_Java_InputOutput_Serialization._2_Character_Stream_Dynamic_Input_Appr.JavaIoDemo.CharStreamDemo;

import java.io.FileWriter;

public class WriteDemo {
    public static void main(String[] args) {
        try {
            String data = "this is my character stream demo....!!";
            FileWriter fw = new FileWriter("E:\\copypaste\\Abc.txt");
            fw.write(data);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
