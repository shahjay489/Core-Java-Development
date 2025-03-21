package com.jayshah.chapter_7_Exception_Handling._3_Throws_Try_Catch.exceptionhandling2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException, ArithmeticException {
        FileInputStream fis = new FileInputStream("");
    }

    void m1() {
        throw new ArithmeticException();
    }
}