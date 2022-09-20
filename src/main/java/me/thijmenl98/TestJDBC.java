package me.thijmenl98;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: TestJDBC</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-03
 **/
public class TestJDBC {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
        String user = "hbstudent";
        String password = "hbstudent";

        try {
            System.out.println("Attempting to connect to: " + jdbcURL);

            Connection connection = DriverManager.getConnection(jdbcURL, user, password);

            System.out.println("Connection successful");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed");
        }

    }

}
