package com.jayshah.Chapter_14_Arrays._6;

public class BubbleSort {
    static void sortingAlgo(int[] a) {
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

        System.out.println("Final List");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int[] arr = {90, 50, 30, 40, 20, 70, 60, 10, 80};
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 90, 80};

        BubbleSort.sortingAlgo(arr);
    }
}

/*
    Why we need to do "a.length - 1 - pass  " in 2nd for loop?
    - because every round/pass we do not need to check the last element.
    - the last elements already sort it.
    - that is why we need to do "a.length - 1 - pass" otherwise it keeps checking till last elements.

    => if we have lakhs of the elements in the array then it will take a lot of time,
       but by using "- pass" time is decreased and sort fast compare to not using.

    => also why we take boolean variable and use if loop?
       because, if we need to change only one position to sort the array,
       then we do not need to do swapping on entire array elements
       that is why for saving the time and making faster, we use boolean and if loop.
 */