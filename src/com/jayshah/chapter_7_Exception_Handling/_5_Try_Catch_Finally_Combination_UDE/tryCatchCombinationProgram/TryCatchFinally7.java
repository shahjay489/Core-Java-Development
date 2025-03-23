package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.tryCatchCombinationProgram;

/**
 * this is completely right<br>
 * we can write new try-catch bock after try-catch-finally block <br>
 * also, we can write anything between them (see next program)
 */
class TryCatchFinally7 {
    public static void main(String[] args) {
        System.out.println("1");

        try {
            System.out.println(100 / 0);
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        try {
            System.out.println("44");
        } catch (Throwable e) {
            System.out.println("5");
        }

        System.out.println("6");
    }
}