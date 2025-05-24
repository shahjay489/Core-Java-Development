package com.jayshah.Chapter_14_Arrays._7;

public class FindDuplicate1 {
    public static void main(String[] args) {
        int[] arr = {40, 30, 70, 90, 60, 10, 30, 70};
        int temp;

        //array sorted
        for (int p = 0; p < arr.length; p++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        //match the elements
        System.out.println("Duplicate elements are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}


/*

TODO:: you need to optimize this code. Same as we did during bubble sort.

Note:
    --> array sorted
    Outer For loop : for pass - iteration
    Inner For loop : sort
 */