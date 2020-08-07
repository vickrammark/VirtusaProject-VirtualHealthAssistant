/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import intialValues.DataValues;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(urlPatterns = {"/signUpSetter"})
public class signUpSetter extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        PrintWriter out=resp.getWriter();
        String Name=req.getParameter("Name");
        String Email=req.getParameter("Email");
        String Password=req.getParameter("Password");
        dao d=new dao();
        HttpSession session=req.getSession();
        DataValues temp=d.getDetails(Name,Email,Password);
        try {
            String result=d.set_the_Details(temp);
            if(result=="success")
            {
                session.setAttribute("totalDetail",temp);
                RequestDispatcher rd=req.getRequestDispatcher("/welcomePage.jsp");
                rd.forward(req, resp);
            }
            else
            {
                RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
                rd.forward(req, resp);                
            }
           }
        catch (Exception ex) {
            out.println(ex.getMessage());
        } 
        
    }

    
}
