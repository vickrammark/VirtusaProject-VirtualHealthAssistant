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
@WebServlet(urlPatterns = {"/GetPersonalEmployeeDetails"})
public class GetPersonalEmployeeDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String data=req.getParameter("userData");
        EIDhelper eid=new EIDhelper();
        try {
            String result=EIDhelper.getEmployeeDeatils(data,resp);
            resp.getWriter().write(result);
        } catch (Exception ex) {
             out.println(ex.getMessage());
        } 
    }

  
}
