package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.tryCatchCombinationProgram;

class TryCatchFinally4
{
	public static void main(String[] args)
	{
		System.out.println("1");

		try
		{
			System.out.println(100/0);
			System.out.println("2");
		}
		//System.out.println("hi");			// gives error: see notes below this program
		catch(Exception e)
		{
			System.out.println("3");
		}
		//System.out.println("hi");			// gives error: see notes below this program
		finally
		{
			System.out.println("4");
		}

		System.out.println("5");
	}
}

/*

NOTES:

	try with catch : always
	- can not write anything between them.

	try with catch with finally: always
	- can not write anything between them.

 */