/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import test.DoaClass;
import test.validationClass;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class logincheck extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
            String result=null;
            
        try {
            String name=req.getParameter("pname");
            int qty=Integer.parseInt(req.getParameter("quantity"));
            DoaClass d=new DoaClass();
            validationClass v=d.get_the_element(name, qty, resp);
            req.setAttribute("details", v);
             if(d.availability(v,resp)==true)
             {
                 RequestDispatcher rd=req.getRequestDispatcher("/productprest.jsp");
                 rd.forward(req, resp);
             }
             else
             {
                 RequestDispatcher rd=req.getRequestDispatcher("/failproduct.jsp");
                 rd.forward(req, resp);
                 
             }
   
        } catch (Exception ex) {
           out.println(ex.getMessage());
        }
    }

}
      