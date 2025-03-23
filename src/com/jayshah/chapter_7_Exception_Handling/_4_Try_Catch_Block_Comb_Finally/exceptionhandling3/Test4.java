package com.jayshah.chapter_7_Exception_Handling._4_Try_Catch_Block_Comb_Finally.exceptionhandling3;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test4 {
    public static void main(String[] args) {
        normalTryCatchBlock();
        tryWithResourceBlock();
    }


    private static void normalTryCatchBlock() {
        Connection con = null;
        try {
            Class.forName(" ");
            con = DriverManager.getConnection("", "", "");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                con.close(); // or you can use throwable instead of trycatch
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static void tryWithResourceBlock() {
        try {
            // Class is not inherit AutoClosable that is why
            // we can not use try with resources block
            Class.forName("");
        } catch (Exception e) {
            System.out.println(e);
        }

        try (Connection con = DriverManager.getConnection("", "", "");) {
                // body
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
