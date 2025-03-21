package com.jayshah.chapter_7_Exception_Handling._3_Throws_Try_Catch.conceptPrograms;

public class Test4 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("-----------Thank you------------");
    }
}