package com.jayshah.chapter_17_Java_Database_Connecticity._5.mainpkg;

import com.jayshah.chapter_17_Java_Database_Connecticity._5.dbconnection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException {
        try (
                Connection con = DbConnection.getConnection();

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
