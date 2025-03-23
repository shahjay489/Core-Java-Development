package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.TryCatchBlockCombination;

class TryCatch10 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(100 / 0);
        } catch (RuntimeException e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}