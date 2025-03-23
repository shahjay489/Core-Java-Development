package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.TryCatchBlockCombination;

class TryCatch6 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3 !!!!");
        }
        // uncomment below line and try to run program
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("3 ....");
//        }
        System.out.println("4");
    }
}

/*
In first catch block, you provide the parent exception name then you can not provide the child  name in 2nd catch block.

exception-error: java: exception java.lang.ArrayIndexOutOfBoundsException has already been caught


- we should maintain inheritance structure(hierarchy) properly...

 */