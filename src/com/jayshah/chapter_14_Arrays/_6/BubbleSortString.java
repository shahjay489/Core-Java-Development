package com.jayshah.chapter_14_Arrays._6;

public class BubbleSortString {
    static void sortingAlgo(String[] a) {
        for (int pass = 0; pass < a.length; pass++) {
            String temp;
            boolean b = false;
            for (int i = 0; i < a.length - 1 - pass; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    System.out.println(a[i].compareTo(a[i + 1]));
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    b = true;
                }
            }
            if (b == false) {
                break;
            }
        }

        System.out.println("Final List");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Govardhan", "Dwarkesh", "Giriraj", "Krishna", "Madhav"};

        BubbleSortString.sortingAlgo(arr);
    }
}


/*

    Compares two strings lexicographically.
    lexicographically : convert each string character into unicode value and return it(-10 or 0).
 */