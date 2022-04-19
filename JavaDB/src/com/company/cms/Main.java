package com.company.cms;

import com.company.cms.repository.DbConnnetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

//    DbConnnetion connnetion = new DbConnnetion();

    static Scanner scanner = new Scanner(System.in);
    static Integer choice;

    public static void main(String[] args) throws Exception {
        try {
            DbConnnetion connect = new DbConnnetion();
            connect.createDbConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Who are you?");
        System.out.println("1. Instructor");
        System.out.println("2. Student");
        System.out.println("99. Exit");
        choice = scanner.nextInt();
        scanner.nextLine();




    }

}