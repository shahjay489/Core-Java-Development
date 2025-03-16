package com.jayshah.chapter_7_Exception_Handling._2_Checked_Unchecked_Exceptions_Throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Test1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("e://aaa.txt");
            int i = fis.read();
            System.out.println(i);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}