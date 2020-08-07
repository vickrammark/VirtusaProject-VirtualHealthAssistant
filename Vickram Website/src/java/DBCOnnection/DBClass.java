/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCOnnection;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class DBClass {
    static Connection con=null;
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
         Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/vickramwebsite?autoReconnect=true&useSSL=false";
            String uname="root";
            String pass="pass123";
        con=DriverManager.getConnection(url,uname,pass);
        return con;
    }
}
