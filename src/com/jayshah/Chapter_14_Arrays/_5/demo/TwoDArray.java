package com.jayshah.Chapter_14_Arrays._5.demo;

public class TwoDArray {
    public static void main(String[] args) {
        //Way 1
        int[][] a = new int[2][3];
        a[0][0] = 10;
        //--------

        //Way 2
        int[][] b = {{10, 20, 30}, {40, 50, 60}};

        //Way 3
        int[][] c = new int[][]{{10, 20, 30}, {40, 50, 60}};
    }
}
