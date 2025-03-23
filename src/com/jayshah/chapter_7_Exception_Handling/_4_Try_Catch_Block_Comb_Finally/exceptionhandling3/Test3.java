package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.exceptionhandling3;

import java.io.FileInputStream;

public class Test3 {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("");
        ) {
            fis.read();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}