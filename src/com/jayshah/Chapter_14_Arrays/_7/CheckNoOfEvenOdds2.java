package com.jayshah.Chapter_14_Arrays._7;

/*

how we can put even and odd numbers in the array.
- here we can understand why we need collection.
- or we can create an array to put those even and odd but we can not define the size of array because we do not know how many numbers of even and odd.
- for this we can create 2 different array with the same size of the actual array but in this way memory wastage concept occurred.
- but we can do using count. just count how many even and odd then make an array according to.

 */
public class CheckNoOfEvenOdds2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 5, 9, 3};

        //-----check no of even and odd elements in an array-----------
        int even_count = 0, odd_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_count = even_count + 1;
            } else {
                odd_count = odd_count + 1;
            }
        }
        //------------------------------------------------------------

        //----create an array for even and odd numbers-----------
        int[] even_arr = new int[even_count];
        int[] odd_arr = new int[odd_count];
        //-------------------------------------------------------

        //--------------put values in even and odd array---------
        int even_index_pos = 0, odd_index_pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_arr[even_index_pos] = arr[i];
                even_index_pos = even_index_pos + 1;
            } else {
                odd_arr[odd_index_pos] = arr[i];
                odd_index_pos = odd_index_pos + 1;
            }
        }
        //-----------------------------------------------------------


        //--------print array values-----------------------------------
        for (int i = 0; i < even_arr.length; i++) {
            System.out.print(even_arr[i] + " ");
        }
        System.out.println("\n===============================");
        for (int i = 0; i < odd_arr.length; i++) {
            System.out.print(odd_arr[i] + " ");
        }
        //------------------------------------------------------------
    }
}
