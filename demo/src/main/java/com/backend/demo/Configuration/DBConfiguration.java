package com.backend.demo.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DBConfiguration {

     @Value("${mysql-host}")
    String host;
     @Value("${mysql-username}")
    String user;
     @Value("${mysql-password}")
    String password;

//
//    @Bean
//    public Connection mySQLConnection() {
//        System.out.println("I am starting from configuration");
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://"+host+"/library", user , password);
//        } catch (SQLException e) {
//            System.out.println("Exception here" + e.getMessage());
//        }
//        return connection;
//    }
//    @Bean
//    public Connection myOracleConnection() {
//        System.out.println("I am starting from configuration");
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "Tulasi", "Tulasi");
//        } catch (SQLException e) {
//            System.out.println("Exception here" + e.getMessage());
//        }
//        return connection;
//    }

}