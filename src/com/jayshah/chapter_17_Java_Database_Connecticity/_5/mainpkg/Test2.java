package com.jayshah.chapter_17_Java_Database_Connecticity._5.mainpkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from register");
                ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                System.out.println("Name : " + rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
