package com.jayshah.chapter_14_Arrays._5.demo;

public class DifferentWaysToPrintArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        //way 1
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //iterate the elements in backward direction : need to use for loop
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        System.out.println("------------------------------------");

        //way 2 (while loop)
        int j = 0;
        while (j < a.length) {
            System.out.println(a[j]);
            j++;
        }

        System.out.println("=====================================");
        //way 3 (for each loop)

        for (int v : a) {
            System.out.println(v);
        }

        System.out.println("===========================================");

        String[] str = {"deepak", "amit", "deepesh"};
        for (String s : str) {
            System.out.println(s);
        }
    }
}

/*
    normally we are not using the while loop.
    in for loop, number of iteration is fixed but in while loop we do not know.

    still for loop has problem with speed.
    in this for loop,
            first, need to declare i variable
                then initialize that variable
            second, calculate the length of the array
            third, increment the value of the i.
            So, it makes difference of the speed
            what if we have big array? then it slows down program speed.

      that is why Java created for-each loop.

      in for-each loop we declare variable, but we do not calculate length and do not need to increment the value of the variable.


 */