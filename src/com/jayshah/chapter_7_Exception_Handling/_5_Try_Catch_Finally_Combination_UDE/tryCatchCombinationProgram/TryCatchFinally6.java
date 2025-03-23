package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.tryCatchCombinationProgram;

class TryCatchFinally6 {
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
        // can not write anything after finally
        // use multiple catch block before finally
//		catch(Throwable e)
//        {
//            System.out.println("5");
//        }

        System.out.println("6");
    }
}