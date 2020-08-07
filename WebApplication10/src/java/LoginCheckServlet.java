

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import signUp.DBConnection;
/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/LoginCheckServlet"})
public class LoginCheckServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
       
        
        
        try {
           String data=req.getParameter("userData");
            String ID=req.getParameter("currentIdName");
            DBConnection db=new DBConnection();
            HttpSession session=req.getSession();
            Connection con=db.getDBConnection();
            Statement st=con.createStatement();
  String query="select EID from employeedetails where "+ID+"='"+data+"'";            ResultSet s1=st.executeQuery(query);
            if(s1.next())
              {
                resp.setContentType("text/plainText");
                resp.getWriter().write("accepted&true");    
              }
              else
              {
                resp.setContentType("text/plainText");
                resp.getWriter().write("Sorry User does not exist&false");
              }
        } 
        catch (Exception ex) {
              out.println(ex.getMessage());
        }
        }
  
}

