package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.tryCatchCombinationProgram;

class TryCatchFinally1 {
    public static void main(String[] args) {
        System.out.println("1");

        try {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }

        System.out.println("5");
    }
}