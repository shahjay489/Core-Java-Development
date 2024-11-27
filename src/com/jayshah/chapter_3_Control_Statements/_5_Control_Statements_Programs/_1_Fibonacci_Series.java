/*
 *   1. WAP to print Fibonacci Series.
 *      0 1 1 2 3 5 8 13 21 34 55 89
 * */
package com.jayshah.chapter_3_Control_Statements._5_Control_Statements_Programs;

public class _1_Fibonacci_Series {
    public static void main(String[] args) {
        int number1 = 0, number2 = 1;

        System.out.print(number1 + " " + number2);

        for (int i = 1; i <= 10; i++) {
            int temp = number1 + number2;
            System.out.print(" " + temp);
            number1 = number2;
            number2 = temp;
        }
    }
}
// here you can use while loop..
// but when you do not know number of iteration that you need to use while loop
// here we have everything

/*
 *   int number1 = 0, number = 1; => 0 + 1 = 1 <= temp
 *       number1 = 0, number = 1, temp = 1
 *        swift value left to right
 *   int number1 = 1, number = 1, temp = 1+1= 2;
 *   int number1 = 1, number = 2, temp = 1+2= 3;
 *              ....................
 *                   repeat
 *
 *
 * Note: main concept of the swapping the number, we use here
 * */