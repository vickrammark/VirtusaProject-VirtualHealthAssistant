/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import signUp.DBConnection;

/**
 *
 * @author DELL
 */
@WebServlet(name = "SignUpDetails", urlPatterns = {"/SignUpDetails"})
public class SignUpDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        PrintWriter out=resp.getWriter();
        try {
            String data=req.getParameter("userData");
            String ID=req.getParameter("currentIdName");
            DBConnection db=new DBConnection();
            Connection con=db.getDBConnection();
            String query="select EID from employeedetails where "+ID+"='"+data+"'";
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery(query);
            

            if(res.next())
            { 
                resp.setContentType("text/plainText");
              resp.getWriter().write("user with same already exist");    
            }
            else
            {
              resp.setContentType("text/plainText");
              resp.getWriter().write("accepted");                    
            }
              
        } 
        catch (Exception ex) {
        out.println(ex.getMessage());
        }
        
    }
}
