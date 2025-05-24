package com.jayshah.chapter_14_Arrays._7;

public class CheckNoOfEvenOdds {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 5, 9, 3};

        int even_count = 0, odd_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_count = even_count + 1;
                System.out.println("Even No : " + arr[i]);
            } else {
                odd_count = odd_count + 1;
                System.out.println("Odd No : " + arr[i]);
            }
        }

        System.out.println("====================================================");

        System.out.println("No of even no's are  : " + even_count);
        System.out.println("No of odd no's are  : " + odd_count);
    }
}
