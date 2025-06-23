package com.jayshah.chapter_17_Java_Database_Connecticity._5.demo;

import com.jayshah.chapter_17_Java_Database_Connecticity._5.dbconnection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudOperation {
    void getValues(String email) {
        try (
                Connection con = DbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("select * from register where email=?");
        ) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Name : " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void updateDetails(String name, String email) {
        try (
                Connection con = DbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("update register set name=? where email=?");
        ) {
            ps.setString(1, name);
            ps.setString(2, email);

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Details updated successfully");
            } else {
                System.out.println("Details not updated due to some error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void insertDetails(String name, String email, String pass, String gender, String city) {
        try (
                Connection con = DbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
        ) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            ps.setString(4, gender);
            ps.setString(5, city);

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Registered successfully");
            } else {
                System.out.println("Not registered due to some error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void deleteDetails(String email) {
        try (
                Connection con = DbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("delete from register where email=?");
        ) {
            ps.setString(1, email);

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Deleted successfully");
            } else {
                System.out.println("Not deleted due to some error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
