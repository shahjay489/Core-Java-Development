package com.jayshah.Chapter_14_Arrays._7;

public class FindDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {40, 30, 70, 90, 60, 10, 30, 70};

        int count = 0;

        System.out.println("Duplicate elements are :- ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                    System.out.println(count + ". " + arr[i]);
                }
            }
        }
    }
}


/*

    1st For Loop : for array traversing
    2nd For Loop : matching all elements

------------------------------------------------

- here in this array if I have 30 3 times so it will print that much time,
but what we want we need to print duplicate element just one time.
what if you have 70 five times then you will print five times?
NO, we will print only one time 30 and 70 no matter how many time it repeat.

So, we can solve this problem in 2 ways:
1.) using the collection
2.) make same size new array and insert the element, and before insert in the new array check it that value is already inserted or not.
    - this approach is considering lengthy - it needs to do more work
   - this is disadvantages of the array.
    - we can not do big implementation properly in the array.



 */