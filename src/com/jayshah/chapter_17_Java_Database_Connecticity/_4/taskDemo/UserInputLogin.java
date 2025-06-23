package com.jayshah.chapter_17_Java_Database_Connecticity._4.taskDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserInputLogin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Email ID : ");
        String user_email = s.next();

        System.out.println("Enter Password : ");
        String user_pass = s.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "root");

            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            // email=? and password=? called positional parameters
            ps.setString(1, user_email);
            ps.setString(2, user_pass);

            ResultSet rs = ps.executeQuery();   // ResulSet only use in Select Query
            /*
                 here we know, number of total values is 1
                 that is why we use if loop
                 otherwise more than 1 value would be possible
                 then we need to use while loop
             */
            if (rs.next()) {
                System.out.println("Login Successfully");
                System.out.println("Welcome : " + rs.getString("name"));
            } else {
                System.out.println("Invalid email id and password");
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
