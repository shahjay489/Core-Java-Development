package com.jayshah.chapter_17_Java_Database_Connecticity._5.dbconnection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
    static Connection con;

    static String driver_class, jdbc_url, username, password;

    /*
        here we make static method
        so, we do not need to make n object of the class to call this method.
     */
    public static Connection getConnection() {
        try {
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream("src/com/jayshah/chapter_17_Java_Database_Connecticity/_5/dbconnection/dbdetails.properties");
            InputStream is = DbConnection.class.getResourceAsStream("dbdetails.properties");
            p.load(is);

            driver_class = p.getProperty("driver_class");
            jdbc_url = p.getProperty("url");
            username = p.getProperty("username");
            password = p.getProperty("password");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Class.forName(driver_class);
            con = DriverManager.getConnection(jdbc_url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
