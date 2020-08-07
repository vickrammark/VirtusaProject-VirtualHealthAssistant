/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailSending;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    @EJB
    private MailSenderBean mailSender; 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
        PrintWriter out=resp.getWriter();
        String toEmail=req.getParameter("email");
        String subject=req.getParameter("subject");
        String message=req.getParameter("message");
        String fromEmail="bunnydummy65@gmail.com";
        String  userName="Dummy Bunny";
         String password="lbqqyfkiivhpejnn"; 
        try {
            mailSender.sendEmail(fromEmail, userName, password, toEmail, subject, message);
        } catch (Exception ex) {
           out.println(ex.getMessage()+" failed");
        }
         out.println("<h1>Mail status</h1><br>");
         out.println("<b>Mail sent successfully</b><br>");
         out.println("<a href='Login.jsp'>Click here</a>");
      }
   
}
