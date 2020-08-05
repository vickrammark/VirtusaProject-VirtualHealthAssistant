
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.util;

import com.VirtusaProject.virtual_health_assistant.modal.LoginDetailsModal;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;


public class dataBaseConnection extends HttpServlet{
    
    
    public Connection getConnection() throws SQLException
    {   
        Connection con=null;
        try
        {    
                Class.forName("com.mysql.jdbc.Driver");
                String url= "jdbc:mysql://localhost:3306/virtual_health_assistant?autoReconnect=true&useSSL=false";
                String username="root";
                String password="pass123";
                con=DriverManager.getConnection(url,username,password);
                return con;
        }
        catch(Exception ex)
        {
        }
        return con;
    }
}
