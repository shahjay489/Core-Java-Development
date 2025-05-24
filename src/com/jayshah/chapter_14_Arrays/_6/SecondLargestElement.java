package com.jayshah.chapter_14_Arrays._6;

/**
 *  WAP to find the second largest element in an array <br>
 *  using Bubble Sort
 */
public class SecondLargestElement {

    static void secondLargestElement1(int[] a) {
        for (int pass = 0; pass < a.length; pass++) {
            int temp;
            boolean b = false;      // int flag = 0;
            for (int i = 0; i < a.length - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    b = true;   // flag = 1;
                }
            }
            if (b == false) {   // if(flag == 0)
                break;
            }
        }
        System.out.println("Second Largest element is : " + a[1]);
    }

    public static void main(String[] args) {
        int[] a = {30, 70, 10, 20, 60, 50, 90};
        SecondLargestElement.secondLargestElement1(a);
    }
}
