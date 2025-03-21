package com.jayshah.chapter_7_Exception_Handling._3_Throws_Try_Catch.conceptPrograms;

public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            int a = 100, b = 0, c;
            System.out.println("2");
            c = a / b;
            System.out.println("3");
            System.out.println(c);
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("5");
            System.out.println("You cannot divide by zero");
            System.out.println("6");
        }

        System.out.println("-----------Thank you------------");
    }
}

/*

    >> javac test2.java         // this is compile time
    >> java test2   // this is run time

    100/0 will be compiled and do not give the exception error compile time,
    however at the run time it will give exception error.
    why?
    because it's runtime and during compile time compiler does not have any idea if it throws an exception or not.


    - here this line is risky "c = a / b;" so need to add in try catch block, but if we do not know which line is risky then we put entire code in try catch block.

    - also without try catch program will not execute successfully, if it has an exception error.
    - but with try catch, our program can execute successfully with showing proper exception which we mentioned in the catch black with message.

    - You should try to run this without try-catch and with try-catch.
 */