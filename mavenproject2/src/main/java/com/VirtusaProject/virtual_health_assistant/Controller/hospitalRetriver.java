/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

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
@WebServlet(name = "hospitalRetriver", urlPatterns = {"/hospitalRetriver"})
public class hospitalRetriver extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          
        PrintWriter out =resp.getWriter();
        String purpose=req.getParameter("function");
        if(purpose.equals("hospital"))
        {    
        hospitalDataHelper hp=new hospitalDataHelper();
        String place_name=req.getParameter("placeName");
        String specName=req.getParameter("specName");
        String result="";
        try {
            result=hp.getHospitalDeatils(place_name, specName);
        } catch (Exception ex) {
           out.println(ex.getMessage());
        }
        resp.setContentType("text/html");
        resp.getWriter().write(result);
        }
        else if(purpose.equals("doctor"))
        {
            String specName=req.getParameter("specName");
            String hospitalId=req.getParameter("hospitalId");
            hospitalDataHelper hp=new hospitalDataHelper();
            String result="";
            try {
                result=hp.getDoctors(specName, hospitalId);
            } catch (Exception ex) {
                out.println(ex.getMessage());
            }
            resp.setContentType("text/html");
            resp.getWriter().write(result);
        }
        else if(purpose.equals("hospitalName"))
        {
            String specName=req.getParameter("specName");
            String placeName=req.getParameter("placeName");
            String result="false";
            hospitalDataHelper hp=new hospitalDataHelper();
            try
            {
                result=hp.getHospital(specName, placeName);
            }
            catch(Exception ex)
            {
                out.println(ex.getMessage());
            }
            resp.setContentType("text/html");
            resp.getWriter().write(result);
        }
        
    }             
}
