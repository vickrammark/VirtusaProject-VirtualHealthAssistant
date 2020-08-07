/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/EIDload"})
public class EIDload extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EIDhelper id=new EIDhelper();
        ArrayList EIDarray =id.getEid(resp);
        PrintWriter out =resp.getWriter(); 
       String lvalue;
      out.println("<select class='iloveyou' id='eid' onchange='getdetails()' >");
      out.println("<option value='0'>Select</option>");
      for(int i=0;i<EIDarray.size();i++)
      {
         lvalue=EIDarray.get(i).toString();
         out.println("<option value="+lvalue+">"+lvalue+"</option>");
      }
      out.println("</select>");
    }

  
}
