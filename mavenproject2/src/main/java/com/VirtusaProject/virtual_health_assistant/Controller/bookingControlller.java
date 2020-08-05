/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirtusaProject.virtual_health_assistant.modal.bookingModal;
import com.VirtusaProject.virtual_health_assitant.dao.bookingDao;
import com.VirutsaProject.virtual_health_assistant.Setter.bookingSetter;
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
@WebServlet(name = "bookingControlller", urlPatterns = {"/bookingControlller"})
public class bookingControlller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String docId=req.getParameter("doctorId");
            String email=req.getParameter("email");
            String reason=req.getParameter("reason");
            bookingSetter bs=new bookingSetter();
            PrintWriter out=resp.getWriter();
            bookingModal bm=bs.setBooking(docId, email,reason);
            bookingDao bk=new bookingDao();
            String result="";
        try {
            result=bk.setBookingDeails(bm);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
         resp.setContentType("text/html");
         if(result.equals("success"))
         {   
         resp.getWriter().write("success");
         }
         else
         {
          resp.getWriter().write("failed");
         }
            
    }
 

 
}
