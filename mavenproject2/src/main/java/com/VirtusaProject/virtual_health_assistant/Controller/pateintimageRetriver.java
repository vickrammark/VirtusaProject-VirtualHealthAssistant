/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "pateintimageRetriver", urlPatterns = {"/pateintimageRetriver"})
public class pateintimageRetriver extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    byte[] img=null;
        ServletOutputStream sos=null;
        dataBaseConnection db=new dataBaseConnection();
        String result="";
        String email=req.getParameter("email");
        String role=req.getParameter("role");
        try {
            Connection con=db.getConnection();
            String query="";
            if(role.equals("patient"))
            {    
            query="select photo from patient_details where email=?";
            }
            else if(role.equals("doctor"))
            {
             query="select photo from doctor_details where email=?";   
            }
            PreparedStatement pre=con.prepareStatement(query);
            pre.setString(1, email);
            ResultSet res=pre.executeQuery();
            if(res.next())
            {
                img=res.getBytes("photo");
                out.println("success");
            }
            sos=resp.getOutputStream();
            sos.write(img);
            sos.close();
            
        } catch (Exception ex) {
        }
    }

    
}
