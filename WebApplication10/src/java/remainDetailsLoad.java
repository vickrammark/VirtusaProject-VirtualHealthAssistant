/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(urlPatterns = {"/remainDetailsLoad"})
public class remainDetailsLoad extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out=resp.getWriter();
        String FIRST_NAME=req.getParameter("data7");
        String LAST_NAME=req.getParameter("data1");
        String GENDER=req.getParameter("data2");
        String DOB=req.getParameter("data3");
        String MOBILE=req.getParameter("data4");
        String CITY=req.getParameter("data5");
        String STATE=req.getParameter("data6");
        dao d=new dao();
        try {
            String result=d.saveDetails(FIRST_NAME,LAST_NAME,GENDER,DOB,MOBILE,CITY,STATE,resp);
            resp.getWriter().write(result);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        } 
    }

    
}
