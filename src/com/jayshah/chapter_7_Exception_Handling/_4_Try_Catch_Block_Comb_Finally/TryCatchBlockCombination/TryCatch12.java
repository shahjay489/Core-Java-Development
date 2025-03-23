package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.TryCatchBlockCombination;

class TryCatch12 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(100 / 0);
        }
    /*
        Object is the top most parent
         and its child is a throwable...
         so we can write Throwable but can not write Object
         because
         object of Throwable class - can make but
         object of Object class - can not make it

         Why? because
         It can not have these things

         normally in object total 3 things are stored
                1.) Exception class name
                2.) Message / Desc
                3.) Stack Trace (Line number)
    */
//        catch (Object e) {
//            System.out.println("3");
//        }
        catch (Throwable e) {
            System.out.println("3. Throwable ");
        }

        System.out.println("4");
    }
}