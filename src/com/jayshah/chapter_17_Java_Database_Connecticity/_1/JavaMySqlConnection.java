package com.jayshah.chapter_17_Java_Database_Connecticity._1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JavaMySqlConnection {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager. getConnection("jdbc:mysql://localhost:3306/db_name","id","password");
            PreparedStatement ps = con.prepareStatement("insert into tble_name values('Govardhan', 'govardhan@gmail.com')");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


/*
    When you get an error: java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
    then you need to add mysql-connector-java .jar file into the library.
         - add jar

 */