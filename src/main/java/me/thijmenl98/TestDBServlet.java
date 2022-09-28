package me.thijmenl98; /**
 * <h3>Project: spring-bc</h3>
 * <h5>File: ${NAME}</h5>
 * <h5>Package: ${PACKAGE_NAME}</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-28
 **/

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "TestDBServlet", value = "/TestDBServlet")
public class TestDBServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "springstudent";
        String password = "springstudent";

        String jdbcURL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";

        try {
            PrintWriter out = response.getWriter();
            out.println("Connecting to database: " + jdbcURL);

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(jdbcURL, user, password);

            out.println("Connection succesful!");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
