/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirtusaProject.virtual_health_assitant.dao.checkUser;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    static PrintWriter out;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        out=resp.getWriter(); 
        resp.setContentType("text/html");
        String role=req.getParameter("role");
        String Name=req.getParameter("Name");
        String Email=req.getParameter("Email");
        String Password=req.getParameter("Password");
        checkUser ch=new checkUser();
        try {
            if(ch.checkUser(Name, Email, Password,role,out))
            {
                
                if(role.equals("doctor"))
                {
                    String email=Email;
                    req.setAttribute("message",email); 
                    RequestDispatcher rd=req.getRequestDispatcher("/doctorChooser.jsp");
                    rd.forward(req, resp);
                }
                else if(role.equals("patient"))
                {
                    String email=Email;
                    req.setAttribute("message",email);
                    RequestDispatcher rd=req.getRequestDispatcher("/PateintChooser.jsp");
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
                String result="false";
                req.setAttribute("message",result);
                RequestDispatcher rd=req.getRequestDispatcher("/Login.jsp");
                rd.forward(req, resp);
            }
        } catch (Exception ex) {
              out.println("mainans="+ex.getMessage());
        }
    }
  
    }



