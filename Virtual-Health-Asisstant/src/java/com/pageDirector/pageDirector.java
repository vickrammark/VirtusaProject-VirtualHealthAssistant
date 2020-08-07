/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pageDirector;

import DBconnection.dataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "pageDirector", urlPatterns = {"/pageDirector"})
public class pageDirector extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter(); 
        try {
            String role=req.getParameter("role");
            String Name=req.getParameter("Name");
            String Email=req.getParameter("Email");
            String Password=req.getParameter("Password");
            
            if(checkUser(Name, Email, Password,role))
            {
                
                if(role.equals("doctor"))
                {
                    
                    RequestDispatcher rd=req.getRequestDispatcher("/doctorRegistration.jsp");
                    rd.forward(req, resp);
                }
                else if(role.equals("patient"))
                {
                    RequestDispatcher rd=req.getRequestDispatcher("/patientRegistration.jsp");
                    rd.forward(req, resp);
                }
                else if(role.equals("lab technician"))
                {
                    RequestDispatcher rd=req.getRequestDispatcher("/labRegistration.jsp");
                    rd.forward(req, resp);
                }
            }
            else
            {
                req.setAttribute("message","invalid");
                RequestDispatcher rd=req.getRequestDispatcher("/Login.jsp");
                rd.forward(req, resp);
            }
        } catch (SQLException ex) {
            out.println(ex.getMessage());
       }
    }
    boolean checkUser(String Name,String Email,String password,String role) throws SQLException
    {
        
        loginDao d=new loginDao();
        LoginDetails log=d.setElement(Name, Email, password, role);
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getDbConnection(log);
        String query="select * from doctor_details where email=? and password=?"; 
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1, log.getEmail());
        pre.setString(2,log.getPassword());
        ResultSet res=pre.executeQuery();
        if(res.next())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
