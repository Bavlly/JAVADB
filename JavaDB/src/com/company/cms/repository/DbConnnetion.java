package com.company.cms.repository;

import java.sql.*;
import java.util.Scanner;

public class DbConnnetion {
    String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
    String user = "root";
    String password = "pluralsight";
    Connection connection;

    public void createDbConnection() {
        try {
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Connected to the database");

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Course");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("WElkom"+ resultSet);


        } catch (SQLException var2) {
            System.out.println("Connection with database failed.");
            var2.printStackTrace();
        }


    }
//    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306"/CoreJavaDB?" + "user=root&password=pluralsight&server)

}
