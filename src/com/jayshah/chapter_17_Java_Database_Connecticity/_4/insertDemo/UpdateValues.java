package com.jayshah.chapter_17_Java_Database_Connecticity._4.insertDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter email id : ");
        String email1 = s.next();

        System.out.println("Enter password (to be updated)");
        String pass1 = s.next();

        System.out.println("Enter city (to be updated)");
        String city1 = s.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "root");

            PreparedStatement ps = con.prepareStatement("update register set password=?, city=? where email=?");
            ps.setString(1, pass1);
            ps.setString(2, city1);
            ps.setString(3, email1);

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Success");
            } else {
                System.out.println("Fail");
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
