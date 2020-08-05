/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirtusaProject.virtual_health_assistant.modal.appointmentModal;
import com.VirtusaProject.virtual_health_assitant.dao.appointmentDao;
import com.VirutsaProject.virtual_health_assistant.Setter.appointmentSetter;
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
@WebServlet(name = "appointmentController", urlPatterns = {"/appointmentController"})
public class appointmentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        PrintWriter out=resp.getWriter();
        String email=req.getParameter("email");
        appointmentModal am=new appointmentModal();
        appointmentSetter ap=am.getAppointmentEmail(email);
        appointmentDao da=new appointmentDao();
        String result="false";
        try {
            result=da.getAppointmentDeatils(ap);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
        resp.setContentType("text/html");
        resp.getWriter().write(result);
        
    }
    
}
