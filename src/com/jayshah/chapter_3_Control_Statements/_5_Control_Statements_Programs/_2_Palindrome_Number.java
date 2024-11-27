/*
 *   2. WAP to check palindrome number.
 *      123 - 321
 *      12321
 * */
package com.jayshah.chapter_3_Control_Statements._5_Control_Statements_Programs;

public class _2_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println("with2number");
        with2number();
        System.out.println("withExtra3rdVariable");
        withExtra3rdVariable();

    }

    private static void with2number() {
        int number = 12321;
        int originalNumber = number;
        int reminder, reverse = 0;
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is palindrome number");
        } else {
            System.out.println(originalNumber + " is not palindrome number");
        }

    }

    private static void withExtra3rdVariable() {
        int number1 = 12321;

        int temp = number1;
        int reminder, reverse = 0;
        while (temp != 0) {
            reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp = temp / 10;
        }

        if (number1 == reverse) {
            System.out.println(number1 + " is palindrome number");
        } else {
            System.out.println(number1 + " is not palindrome number");
        }
    }
}

// Note: main concept of reverse the number, we use over here