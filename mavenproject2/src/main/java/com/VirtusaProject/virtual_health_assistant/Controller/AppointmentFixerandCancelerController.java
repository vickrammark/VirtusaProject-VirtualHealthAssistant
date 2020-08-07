/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirtusaProject.virtual_health_assistant.modal.acceptRequestModal;
import com.VirtusaProject.virtual_health_assistant.modal.cancelRequestModal;
import com.VirtusaProject.virtual_health_assistant.modal.updaterModal;
import com.VirtusaProject.virtual_health_assitant.dao.accpetRequestDao;
import com.VirtusaProject.virtual_health_assitant.dao.cancelRequestDao;
import com.VirtusaProject.virtual_health_assitant.dao.updaterDao;
import com.VirutsaProject.virtual_health_assistant.Setter.acceptRequestSetter;
import com.VirutsaProject.virtual_health_assistant.Setter.cancelRequestSetter;
import com.VirutsaProject.virtual_health_assistant.Setter.updaterSetter;
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
@WebServlet(name = "AppointmentFixerandCancelerController", urlPatterns = {"/AppointmentFixerandCancelerController"})
public class AppointmentFixerandCancelerController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();     
        String function=req.getParameter("function");
        String result="";
        if(function.equals("accept"))
        {
        String id=req.getParameter("presId");
        String appDate=req.getParameter("appDate");
        String appTime=req.getParameter("appTime");
        acceptRequestModal am=new acceptRequestModal();
        acceptRequestSetter ar=am.setDetail(id, appDate, appTime);
        accpetRequestDao ad=new accpetRequestDao();
        try {
                result=ad.setAcceptRequest(ar);
            } catch (Exception ex) {
               out.println(ex.getMessage());
            }
            resp.setContentType("text/length");
            resp.getWriter().write(result);
            
        }
        else if(function.equals("cancel"))
        {
            String cid=req.getParameter("presId");
            cancelRequestModal cm=new cancelRequestModal();
            cancelRequestSetter cs=cm.setCancelRequest(cid);
            cancelRequestDao cd=new cancelRequestDao();
            try
            {   
            result=cd.cancelRequest(cs);
            }
            catch(Exception ex)
            {
                out.println(ex.getMessage());
            }
            resp.setContentType("text/html");
            resp.getWriter().write(result);
        }
        else if(function.equals("update"))
        {
             String cid=req.getParameter("presId");
             String AppTime=req.getParameter("AppTime");
             String AppDate=req.getParameter("AppDate");
             String AppConfirmation=req.getParameter("AppConfirmation");
             updaterModal um=new updaterModal();
             updaterSetter us=um.setPresscribeId(cid, AppDate, AppTime, AppConfirmation);
             updaterDao ud=new updaterDao();
             
            try
            {   
            result=ud.updateAppointment(us);
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
