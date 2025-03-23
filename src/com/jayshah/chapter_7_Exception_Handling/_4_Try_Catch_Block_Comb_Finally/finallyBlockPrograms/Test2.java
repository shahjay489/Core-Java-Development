package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.finallyBlockPrograms;

public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("hiiii");
        }
    }
}