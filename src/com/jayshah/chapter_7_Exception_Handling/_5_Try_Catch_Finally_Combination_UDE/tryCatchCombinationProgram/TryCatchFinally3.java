package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.tryCatchCombinationProgram;

class TryCatchFinally3 {
    public static void main(String[] args) {
        System.out.println("1");

		// in this way we can not write it...
		// it gives compile time error
		// finally block always comes last after catch -
        // (last catch block if we have multiple catch block)
    /*
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        }
        finally {
            System.out.println("4");
        }
		catch(Exception e)
        {
            System.out.println("3");
        }
	*/
        System.out.println("5");
    }
}