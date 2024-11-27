/*
 *   3. WAP to print Factorial of the number.
 *      5! = 5*4*3*2*1  (descending order)
 *      5! = 1*2*3*4*5  (ascending order)
 * */

// Note : any method, who calls itself again and again, known as recursion

package com.jayshah.chapter_3_Control_Statements._5_Control_Statements_Programs;

public class _3_Factorial_Number {

    static int fact = 1; // for recursion

    public static void main(String[] args) {
        System.out.println("Simple Way");
        simpleWay();
        System.out.println("Using recursion");
        usingRecursion();
    }

    // using simple way
    public static void simpleWay() {
        int number = 5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }

    // using recursion
    private static void usingRecursion() {
        int number = 5;

        _3_Factorial_Number ob = new _3_Factorial_Number();
        ob.calcFact(number);

        System.out.println("Factorial of " + number + " is " + fact);
    }

    void calcFact(int number) {
        if (number >= 1) {
            fact = fact * number;
            number = number - 1;
            // achieve recursion
            calcFact(number);  // call itself again and again
        }
    }
}

// this program will throw error:
// error: Exception in thread "main" java.lang.StackOverflowError
class PrintFactorial2 {
    public static void main(String[] args) {
        PrintFactorial2 ob = new PrintFactorial2();
        ob.calcFact();
    }

    void calcFact() {
        System.out.println("Govardhan"); // print infinite times
        calcFact();
    }
}


/*
* Note:
*
class PrintFactorial2
{
	public static void main(String[] args)
	{
		PrintFactorial2 ob=new PrintFactorial2();
		ob.calcFact();
    }
	void calcFact()
	{
			calcFact();
	}
}
*           recursion: same method execute again & again
*           calFact() - call infinite time
*           Once this stack is full
*           then it will throw an error
*
*                 STACK
*           |----------------|
*           |----------------|
*           |----------------|
*           |                |
*           |----------------|
*           | calFact()      |
*           |________________|
*           | calFact()      |
*           |________________|
*           | calFact()      |
*           |----------------|
*           | calFact()      |
*           |________________|
*           |  main()        |
*           |________________|
* */