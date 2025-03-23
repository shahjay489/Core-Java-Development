package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally;

/**
 * Advantages:<br>
 * - instead of having 10 catch block, we can write in one catch block.
 * <br>
 * <br>
 * Disadvantages:<br>
 * - If you want to handle each and every exception separately then you need to make different catch block.
 */
class MultiCatchBlock1 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 2);
//            System.out.println(100 / 0);

            int[] a = {10, 20, 30, 40, 50};
            System.out.println(a[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}