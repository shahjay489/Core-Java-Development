package com.jayshah.Chapter_14_Arrays._5.demo;

public class Test {
    public static void main(String[] args) {
        /*
            int[][] a=new int[3][];
            this is not throwing an error because
            compiler thoughts its JaggedArray.

            now we are giving size
            a[0] points first array => a[0]=new int[4];
            a[1] points second array => a[1]=new int[3];
            a[2] points third array  => a[2]=new int[5];

                                   a     <= int[][] a=new int[3][];
                             ______________
                            |    |    |    |
                            |____|____|____|
                              /     \    \
                             /       |    \
                 ___________/______  |     \________________________
                |   |    |    |    | |     |    |    |    |    |    |
                |___|____|____|____| |     |____|____|____|____|____|
                          a[0]       |          a[2]
                                     |
                              _______|______
                             |    |    |    |
                             |____|____|____|
                                  a[1]
         */


//        int[][] a=new int[3][];
//        a[0]=new int[4];
//        a[1]=new int[3];
//        a[2]=new int[5];
//        
//        a[0][0]=10;

        int[][] a = {{10, 20, 30, 40}, {50, 60, 70}, {80, 90, 100, 200, 300}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        System.out.println(a);      // [[I@3d075dc0
        System.out.println(a[0]);   // [I@214c265e
        System.out.println(a[1]);   // [I@448139f0
        System.out.println(a[2]);   // [I@7cca494b

    }
}
