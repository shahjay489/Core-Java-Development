/*
 *   4. WAP to check for Prime Numbers.
 *
 *      Prime numbers: Numbers can be divided by 1 or itself
 *      5 = 1, 5
 *      7 = 1, 7
 *      11 = 1, 11
 * */

/*
 *
 *           number = 7          number = 9
 *           1  23456  7         1 2345678 9
 *       - we know the starting point and the end point
 *       - so we use for loop
 *
 *       - we need to check for numbers which are available
 *         between 1 and number itself.
 *       for (int i=2; i<=number-1; i++)
 *       {
 *           ........
 *       }
 * */

/*
 *
 *   Note: Prime numbers are numbers greater than 1 that have no divisors other than 1 and themselves.
 *        e.g. 2, 3, 5, 7, ....
 *       : 1 is not prime because it only has one divisor: itself.
 * */

package com.jayshah.chapter_3_Control_Statements._5_Control_Statements_Programs;

public class _4_Prime_Numbers {
    public static void main(String[] args) {
        primeNumberExample1();
        primeNumberExample2();
        primeNumberExample3();
        primeNumberExample4();
        System.out.println("");
    }

    public static void primeNumberExample1() {
        int number = 5;
        boolean b = false;  // you can take int temp = 0;  OR b = true
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                b = true;  // temp = 1; OR b = false
            }
        }
        if (b == true) {   // temp == 1; OR b == false; OR just => b
            System.out.println(number + " is Not Prime Number");
        } else {
            System.out.println(number + " is Prime Number");
        }
    }

    /*
     * Note: Let's make more effective way
     *
     *           number = 9
     *           1 2345678 9
     *         So, here maximum which number can be used
     *             to divide by 9 -> half of the 9 = 4.5
     *         So, 9 can be divided by 5 or less than 5
     *               it can not be divided by 6,7,8
     *         if I have big number then we should not check for everything
     *            we can use number/2 in the condition
     *
     * */
    private static void primeNumberExample2() {
        System.out.println("");
        System.out.println("Print prime number from 1 to 100 : in this way having problem - see result");
        for (int number = 2; number <= 100; number++) {
            boolean b = false;

            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    b = true;
                }
            }
            if (b == false) {
                System.out.print(number + ",");
            }
        }
    }

    /*
     * Case : Possibility
     * The above condition is incorrect
     * because it skips the check for factors closer to `number / 2`, which could lead to an incorrect result.
     * You should check up to the square root of the number rather than `number / 2`.
     * This will reduce unnecessary iterations and make your code more efficient.
     * */

    private static void primeNumberExample3() {
        System.out.println("");
        System.out.println("");
        System.out.println("Print prime number from 1 to 1000");

        // Optionally, print 1 explicitly if you want
        // System.out.println("1 is not a prime number");

        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true; // Assume the number is prime

            // Check for factors from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.print(number + ",");
            }
        }
    }

    private static void primeNumberExample4() {
        System.out.println("");
        System.out.println("");
        System.out.println("Sum of prime number from 1 to 100");

        int sum = 0;
        for (int number = 2; number <= 100; number++) {
            boolean b = false;
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    b = true;
                }
            }
            if (b == false) {
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }

}
