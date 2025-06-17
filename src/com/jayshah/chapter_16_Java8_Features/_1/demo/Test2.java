package com.jayshah.chapter_16_Java8_Features._1.demo;

interface DbDriver {
    void getDriverClass();

    void getDriverUrl();

    default void getDriverDetails() {
        System.out.println("driver details");   //1000 lines of code
    }
}

class MySqlConnection implements DbDriver {
    public void getDriverClass() {
        System.out.println("com.mysql.jdbc.Driver");
    }

    public void getDriverUrl() {
        System.out.println("jdbc:mysql://localhost:3306/db_demo");
    }
}

class OracleConnection implements DbDriver {
    public void getDriverClass() {
        System.out.println("oracle.jdbc.OracleDriver");
    }

    public void getDriverUrl() {
        System.out.println("jdbc:oracle:thin:@localhost:1521:xe");
    }
}

public class Test2 {
    public static void main(String[] args) {
        MySqlConnection msql = new MySqlConnection();
        msql.getDriverClass();
        msql.getDriverUrl();
        msql.getDriverDetails();

        OracleConnection oc = new OracleConnection();
        oc.getDriverClass();
        oc.getDriverUrl();
        oc.getDriverDetails();
    }
}
