package com.jayshah.chapter_14_Arrays._7;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 90, 70};

        int element = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
    - here we have problem:
        last element will be set as 2nd last element
        but still at last index, last element will be there.

    - so what we can do is, we can create one more array with one less length. then we need to add all elements in that new array.
    -  Or if you set 0 at last position then it allocates the extra memory.
    - or you need to delete last index position array manually.

    --> that is why Collection concept come.
 */
