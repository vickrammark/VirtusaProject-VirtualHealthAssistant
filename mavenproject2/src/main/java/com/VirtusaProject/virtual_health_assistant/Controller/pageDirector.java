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
import javax.servlet.http.HttpSession;

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
        String email=req.getParameter("Email");
        String Password=req.getParameter("Password");
        checkUser ch=new checkUser();
        try {
            if(ch.checkUser(Name, email, Password,role,out))
            {
             HttpSession session =req.getSession();
                
                if(role.equals("doctor"))
                {
                   
                    session.setAttribute("message",email); 
                    resp.sendRedirect("doctorChooser.jsp");
                }
                else if(role.equals("patient"))
                {
                   
                    session.setAttribute("message",email); 
                    resp.sendRedirect("PateintChooser.jsp");
                }
                else if(role.equals("lab technician"))
                {
                    
                    session.setAttribute("message",email); 
                    resp.sendRedirect("/labChooser.jsp");
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



