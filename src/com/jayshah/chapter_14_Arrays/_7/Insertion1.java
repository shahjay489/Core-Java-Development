package com.jayshah.chapter_14_Arrays._7;

/*
    Here, in this insertion
    last value will be gone.
 */
public class Insertion1 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 90, 70};

        int pos = 3;
        int new_element = 60;

        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = new_element;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*
    traverse from the backward.
    and we need to traverse till position 3
    no need to go in 1st and 2nd position.

    10 50 30 80 90 70
      -->  \/ \/ \/ -->
    10 50 __ 30 80 90


 */