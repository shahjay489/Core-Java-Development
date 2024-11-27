/*
 *   5. WAP to check for Armstrong Numbers.
 *
 *      Armstrong numbers:
 *
 *       number = 95
 *         - here number of digits are 2. So, 9^2 & 5^2
 *         - then 9^2 + 5^2 = 95 that is Armstrong number
 *
 *        number = 153
 *         - here number of digits are 3. So, 1^3 & 5^3 & 3^3
 *         - then 1^3 + 5^3 + 3^3 = 153 that is Armstrong number
 *
 * */

package com.jayshah.chapter_3_Control_Statements._5_Control_Statements_Programs;

public class _5_Armstrong_Number {
    public static void main(String[] args) {
        int number = 152;    // (1*1*1) + (5*5*5) + (3*3*3)
        // check for 153

        // step-1
        int temp1 = number;
        int length = 0;
        while (temp1 != 0) {
            length = length + 1;
            temp1 = temp1 / 10;
        }
        // length : 3 (for 152 or 153)
        System.out.println("The number "+number+" has total Length is "+ length);

        int temp2 = number;
        int reminder;
        int sum = 0;
        while (temp2 != 0) {

            // step-2
            reminder = temp2 % 10;
            temp2 = temp2 / 10;

            // step-3
            int mul = 1;
            for (int i = 1; i <= length; i++) {
                mul = mul * reminder;
            }

            // step-4
            sum = sum + mul;
        }
        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
/*
* Step:1 - get number of digits (getting length)
* Step:2 - get individual number - use reminder concept
* Step:3 - multiply individual number till length
* Step:4 - Sum of those
* */