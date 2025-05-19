package com.jayshah.Chapter_14_Arrays._3.program;

public class TwoDArray {
    public static void main(String[] args) {

        // int a[][], b;
        // below do ctrl+space and check any method suggestion you get?
        // a.  here you get it means this is array
        // b.  here you do not get it means this is not an array but it is variable

        //TwoDArray ob=new TwoDArray();
        //System.out.println(ob);

        //int[] a={10,20,30};
        //System.out.println(a);  //[I@659e0bfd   [ : single dimensional array; I : Integer


        int[][] a = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(a);          //[[I@659e0bfd  [[ : 2d array; I : Integer
        System.out.println(a[0]);       //[I@2a139a55
        System.out.println(a[0][0]);    //10
        //System.out.println(a[0][0][0]);

        System.out.println("----------------------------");

        System.out.println(a.length);      //2
        System.out.println(a[0].length);    //3
        //System.out.println(a[0][0].length);


        System.out.println("--------------------------------");

        int[][] b = {{10, 20, 30}, {40, 50, 60}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
