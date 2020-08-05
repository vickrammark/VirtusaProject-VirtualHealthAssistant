package com.VirtusaProject.virtual_health_assistant.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.VirtusaProject.virtual_health_assitant.dao.nameRetriver;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/upadter"})
public class upadter extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        PrintWriter out=resp.getWriter();
        String purpose=req.getParameter("function");
        if(purpose.equals("name"))
        {
         String result="false";
         String role=req.getParameter("role");
         String email=req.getParameter("email");
         nameRetriver nm=new nameRetriver();
            try {
                 result=nm.getName(email,role);
            } catch (Exception ex) {
                out.println(ex.getMessage());
            }
           resp.setContentType("text/html");
           resp.getWriter().write(result);
        }
        else if(purpose.equals("profile"))
        {
            String email=req.getParameter("email");
            String role=req.getParameter("role");
            nameRetriver nm=new nameRetriver();
            String result="false";
            try {
                 result=nm.getProfile(email, role);
            } catch (Exception ex) {
              out.println(ex.getMessage());
            }
            resp.setContentType("text/html");
            resp.getWriter().write(result);
        }
        else if(purpose.equals("update"))
        {   
        String role=req.getParameter("role");
        if(role.equals("patient"))
        {    
        String Fname=req.getParameter("data1");
        String Lname=req.getParameter("data2");
        String birthdate=req.getParameter("data3");
        String occupation=req.getParameter("data4");        
        String sex=req.getParameter("data5");
        String email=req.getParameter("data6");
        String phonenumber=req.getParameter("data7");
        String address=req.getParameter("data8");
        String place_name=req.getParameter("data9");
        int age=Integer.parseInt(req.getParameter("data10"));
        int height=Integer.parseInt(req.getParameter("data11"));
        int weight=Integer.parseInt(req.getParameter("data12"));
        String bloodtype=req.getParameter("data13");
        String body_marks=req.getParameter("data14");
        String mainEmail=req.getParameter("data15");
        nameRetriver nm=new nameRetriver();
        try {
            String result=nm.updator(Fname, Lname, birthdate, occupation, sex, mainEmail, email, phonenumber, address, place_name, age, height, weight, bloodtype, body_marks);
            if(result.equals("true"))
            {
                resp.setContentType("text/html");
                resp.getWriter().write("Update Successfully");
            }
            else
            {
                resp.setContentType("text/html");
                resp.getWriter().write("Sorry Not Update Successfully");
            }
        } catch (Exception ex) {
            out.println(ex.getMessage()+","+address);
        }
       }
        else if(role.equals("doctor"))
        {
        String Fname=req.getParameter("data1");
        String Lname=req.getParameter("data2");
        String birthdate=req.getParameter("data3");
        String address=req.getParameter("data4");        
        String placeName=req.getParameter("data5");
        String email=req.getParameter("data6");
        String phonenumber=req.getParameter("data7");
        String sex=req.getParameter("data8");
        String specialization=req.getParameter("data9"); 
        String qualifiaction=req.getParameter("data10"); 
        String experience=req.getParameter("data11"); 
        String mainEmail=req.getParameter("data12");
        nameRetriver nm=new nameRetriver();
        String result="false";
            try {
                result=nm.updator_docotor(Fname, Lname, birthdate, address, placeName, email, phonenumber, sex, specialization, qualifiaction, experience, mainEmail);
            } catch (Exception ex) {
               out.println(ex.getMessage());
            }
            resp.setContentType("text/html");
            resp.getWriter().write("success");
        }
        }
    }
}
