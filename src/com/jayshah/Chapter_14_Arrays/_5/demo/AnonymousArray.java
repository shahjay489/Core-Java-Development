package com.jayshah.Chapter_14_Arrays._5.demo;

public class AnonymousArray {
    public static void main(String[] args) {
        //int[] arr={10,20,30};

        AnonymousArray.sum(new int[]{10, 20, 30});     // (***) called arguments

        // new int[][] {{10,20,30}, {40,50,60}} : 2d Array or Multi-Dimensional_Anonymous_Array

    }

    static void sum(int[] a) {      // (***) called parameter
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of array is : " + sum);
    }
}

/*

     - We create Anonymous Array when we need to use instantly only one time.
     - As per definition, this array does not have any name so we can not do anything using the name like `name.***()`.

     ----------------------------------

     Method Signature: below both are called method signature
     sum(new int[]{10, 20, 30});
     sum(int[] a) {...}

 */