package com.jayshah.chapter_7_Exception_Handling._3_Throws_Try_Catch.conceptPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }
}

/*
    this program will have a compile time exception error if we do not `throws` the exception.
    - FileInputStream fis = new FileInputStream("");
    - this throws the exception
 */