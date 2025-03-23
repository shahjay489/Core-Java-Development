package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.TryCatchBlockCombination;

class TryCatch4 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}

/*
This program is compile because ArrayIndexOutOfBoundsException is a Runtime exception.
- then it(program) does abnormal terminal.
 */