package com.jayshah.chapter_17_Java_Database_Connecticity._4.insertDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name1 = s.next();

        System.out.println("Enter email id : ");
        String email1 = s.next();

        System.out.println("Enter password : ");
        String pass1 = s.next();

        System.out.println("Enter gender : ");
        String gender1 = s.next();

        System.out.println("Enter city");
        String city1 = s.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "root");

            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
            ps.setString(1, name1);
            ps.setString(2, email1);
            ps.setString(3, pass1);
            ps.setString(4, gender1);
            ps.setString(5, city1);

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Success");
            } else {
                System.out.println("Fail");
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Fail, Error Occurred : " + e);
        }
    }
}
