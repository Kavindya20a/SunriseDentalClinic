package com.sunrisedental.util;
import java.sql.*;

public final class DatabaseConnection {
    private static final String URL="jdbc:mysql://localhost:3306/SunriseDental?useSSL=false&serverTimezone=UTC";
    private static final String USER="root";
    private static final String PASSWORD="";
    private DatabaseConnection(){}
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
