package com.example.Demo.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/db_testing_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }
}
