package com.example;

import com.example.util.DBConnection;

public class TestDB {
    public static void main(String[] args) {
        try {
            System.out.println("connection thanh congg" + " " + DBConnection.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}