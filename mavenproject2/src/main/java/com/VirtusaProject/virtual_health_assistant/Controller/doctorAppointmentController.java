/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirtusaProject.virtual_health_assistant.modal.doctorAppointmentModal;
import com.VirtusaProject.virtual_health_assitant.dao.doctorAppointmentDao;
import com.VirutsaProject.virtual_health_assistant.Setter.doctorAppointmentSetter;
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
@WebServlet(name = "doctorAppointmentController", urlPatterns = {"/doctorAppointmentController"})
public class doctorAppointmentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              
              PrintWriter out=resp.getWriter();
              String function=req.getParameter("function");
              String email=req.getParameter("email");
              doctorAppointmentModal dm=new doctorAppointmentModal();
              doctorAppointmentSetter ds=dm.getAppointment(email);
              String result="";
              doctorAppointmentDao da=new doctorAppointmentDao();
        if(function.equals("request"))      
        {      
           try {
              result=da.getAppointmentDetails(ds);
           } catch (Exception ex) {
              out.println(ex.getMessage());
            }
              resp.setContentType("text/html");
              resp.getWriter().write(result);
        }
        else
        {
           try {
              result=da.getConfirmedPatient(ds);
           } catch (Exception ex) {
              out.println(ex.getMessage());
            }
              resp.setContentType("text/html");
              resp.getWriter().write(result);            
        }
    }    
}
