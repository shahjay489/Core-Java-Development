package com.jayshah.Chapter_14_Arrays._2;

public class Test1 {

    // int rollno;  // just variable

    // int[] rollno; // Array Declaration


    public static void main(String[] args) {
//        int[] a = new int[3];   // creation
//        
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;

        // int a1, []b1;  // compile time error

        int[] a = {10, 20, 30};

        System.out.println("Array Length : " + a.length);

        System.out.println("---------------------------------------");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
