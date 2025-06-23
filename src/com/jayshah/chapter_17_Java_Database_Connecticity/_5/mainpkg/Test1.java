package com.jayshah.chapter_17_Java_Database_Connecticity._5.mainpkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "root");

            ps = con.prepareStatement("select * from register");
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Name : " + rs.getString("namee"));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                System.out.println("1111");
                rs.close();
                ps.close();
                con.close();
                System.out.println("2222");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
