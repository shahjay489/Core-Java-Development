package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.TryCatchBlockCombination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class TryCatch8 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);

            FileInputStream fis = new FileInputStream("");
            System.out.println("2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3 ....");
        } catch (FileNotFoundException e) {
            System.out.println("3 !!!!");
        }
        System.out.println("4");
    }
}

/*
This program gives the Exception:
    but we did not provide that exception or its parent exception
    - ArithmeticException (child)
    - RuntimeException  (parent)
    - Exception (Grand parent)
    - Throwable (Great Grand parent)
 */