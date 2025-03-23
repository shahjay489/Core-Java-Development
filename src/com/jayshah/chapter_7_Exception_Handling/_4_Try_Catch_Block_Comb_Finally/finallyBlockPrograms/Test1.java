package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.finallyBlockPrograms;

import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("");
            fis.read();
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();  // close() method also throws an exception that's why we need to sue try-catch block in finally block.
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
