package com.jayshah.chapter_15_Collection_Framework_Generics._3.programs.demo;

import java.util.ArrayList;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr);    //[I@xxxxxx
//        for(int i:arr)
//        {
//            System.out.println(i);
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //------------------------------------------
        System.out.println("------------------------------");


        ArrayList al = new ArrayList();

        al.add(100);
        al.add(200);
        al.add(300);

        System.out.println(al);
//        for(Object obj:al)        // We must use Object because it treats as object.
//        {
//            System.out.println(obj);
//        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}


/*
    [I@xxxxxx
        [ : 1D (Single Dimension)
        I : integer
        @
        XXX : Hexadecimal value


-> By using for-each loop, we can get Array and Collection both elements.

 */