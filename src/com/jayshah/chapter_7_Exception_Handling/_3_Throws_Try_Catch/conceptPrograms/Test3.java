package com.jayshah.chapter_7_Exception_Handling._3_Throws_Try_Catch.conceptPrograms;

public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);

            int[] a = {10, 20, 30, 40, 50};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of bounds.....");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }

        System.out.println("-----------Thank you------------");
    }
}

/*

    - here we can see multiple exception can be occurred..
    - multiple exception occurred then it will show whatever first exception meet and exit the program..

 */