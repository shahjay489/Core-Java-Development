package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.TryCatchBlockCombination;

class TryCatch3 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}