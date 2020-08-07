package signUp;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class DBConnection {
    static Connection con=null;
    public Connection getDBConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false";
            String uname="root";
            String pass="pass123";
        con=DriverManager.getConnection(url,uname,pass);
        return con;
    }
    
}
