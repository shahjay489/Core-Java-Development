package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.tryCatchCombinationProgram;

class TryCatchFinally5 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        }
//        System.out.println("----"); // it gives error see in notes below this program.
        finally {
            System.out.println("3");
        }

        System.out.println("5");
    }
}
/*

- this program will be compiled
- but it gives runtime exception
- it terminates abnormally
- because we did not handle the exception


NOTES:

	try with finally : allow
	- can not write anything between them.

	error:
	- java: 'try' without 'catch', 'finally' or resource declarations
	- java: 'finally' without 'try'

*/
