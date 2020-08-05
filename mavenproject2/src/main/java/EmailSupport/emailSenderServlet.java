/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailSupport;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "emailSenderServlet", urlPatterns = {"/emailSenderServlet"})
public class emailSenderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
       PrintWriter out=resp.getWriter();
       String Email=req.getParameter("Email");
       emailHelper email=new emailHelper();
       String status="";
        try {
          String  result=email.sendMail(Email);
          if(result.equals("success"))
          {
              status="true";
              req.setAttribute("message",status);
              RequestDispatcher rd=req.getRequestDispatcher("forgetPassword.jsp");
              rd.forward(req, resp);
          }
          else
          {
              status="false";
              req.setAttribute("message",status);
              RequestDispatcher rd=req.getRequestDispatcher("forgetPassword.jsp");
              rd.forward(req, resp);
          }
        } catch (MessagingException ex) {
              out.println(ex.getMessage());
        }
    }

    
}
