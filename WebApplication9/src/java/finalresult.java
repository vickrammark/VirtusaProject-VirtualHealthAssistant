/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/finalresult")
public class finalresult extends HttpServlet {

    
  public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              HttpSession session=request.getSession();
        if(session.getAttribute("name")!=null)
        {
            response.sendRedirect("/index.html");
        }
        response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out=response.getWriter();
        String s=(String) session.getAttribute("name");
        
                
       
    }

   
}
