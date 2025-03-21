package com.jayshah.chapter_7_Exception_Handling._3_Throws_Try_Catch.exceptionhandling2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        Test2 t2 = new Test2();
        t2.m1();
    }

    void m1() throws FileNotFoundException {
        m2();
    }

    void m2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }
}
