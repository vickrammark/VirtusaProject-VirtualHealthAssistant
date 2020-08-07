/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import validation.DoaClass;
import validation.NewClass;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/loginCheck"})
public class loginCheck extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                PrintWriter out=resp.getWriter();
                out.println("hi");

        String s1=req.getParameter("uname");
        int n=Integer.parseInt(req.getParameter("pass"));
        DoaClass d=new DoaClass();
        NewClass nc=d.set_the_element(n, s1);
        boolean result=false;
        try {
            result = d.checkpassword(nc);
        } catch (Exception ex) {
           out.println("cause="+ex.getMessage());
        }
        out.println(result);
        req.setAttribute("Details",nc);
        if(result==true)
        {
            RequestDispatcher rd=req.getRequestDispatcher("intro/Intro Page.jsp");
            rd.forward(req, resp);
        }
        else
        {
            RequestDispatcher rd=req.getRequestDispatcher("/index.html");
            rd.forward(req, resp);  
        }
    }

 
}
