package com.example.util;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/student_management";
    private static final String USER = "postgres";
    private static final String PASSWORD = "0983310337qbnmz";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
