package com.jayshah.chapter_17_Java_Database_Connecticity._3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JavaMysqlConnection {
    public static void main(String[] args) {
        try {
            /*
             this is used to load the driver class
             predefine package : com.mysql.cj.jdbc
             class: Driver
             Class.forName() : to load Driver class into the memory
             if you have mysql 5th version: com.mysql.jdbc.Driver
             if you have mysql latest / 8th version: com.mysql.cj.jdbc.Driver
             */
            Class.forName("com.mysql.cj.jdbc.Driver");

            // after write above line run this program

            /*
                if you get this error: java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
                then you need to any one from below
                       1.) add dependency
                       2.) add .jar file into the project library
                            - find on google : mysql 8 jar connector
                            if you have mysql 5th version then you need to download for that version .jar file

                 - in project, there are 2 parts
                 1. sources packages : for coding
                 2. Libraries

                 - right click on the libraries and click on add jar file option
                 then select .jar file and add


                => .jar files:
                 - in .jar files, put only packages and classes
                 - mysql make it ang give us
                 - Java people just gives API (interfaces and classes) but they do not give its implementation.
                 - that implementation provides by database vendor.
             */

            /*
                this will create connection between java application and database
                DriverManager : class : see capital later
                getConnection : method (static method)
                but this is static method because we call by using class name
                 DriverManager.getConnection();
             */
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "root");

            // For insert into Database -------------------------
            // PreparedStatement ps = con.prepareStatement("insert into register values('aaa', 'aaa@gmail.com')");
            // ps.executeUpdate();

            // For getting value from database -------------------------
            /*
            String user_email = "govardhan@gmail.com";
            String user_password = "govardhan123";

            PreparedStatement ps = con.prepareStatement("SELECT * FROM register WHERE email='"+user_email+"' and password='"+user_password+"'");
                      // *** OR ***
            PreparedStatement ps = con.prepareStatement("SELECT * FROM register WHERE email=? and password=?");
            ps.setString(1, user_email);
            ps.setString(2, user_password);
            // above way is safe for sql injection
            */

            PreparedStatement ps = con.prepareStatement("SELECT * FROM register");
            ResultSet rs = ps.executeQuery();   // ResulSet only use in Select Query
            while (rs.next()) {
                String name1 = rs.getString("name");
                String email1 = rs.getString("email");
                String password1 = rs.getString("password");
                String gender1 = rs.getString("gender");
                String city1 = rs.getString("city");

                System.out.println("Name: " + name1 + "\n"
                        + "Email: " + email1 + "\n"
                        + "Password: " + password1 + "\n"
                        + "Gender: " + gender1 + "\n"
                        + "City: " + city1 + "\n"
                );
            }
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
Task:
1.) by using framework take values(email, password) from user
    - use JFrame Login frame page
        - take email
        - take password
        - login button
    - if match then go to profile frame page
      else show message in a dialog-box - it has ok button
2.) by using Scanner take values(email, password) from user
 */