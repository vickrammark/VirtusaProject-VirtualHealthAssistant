/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/WebApplication2")
public class NewServlet extends GenericServlet
{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    String s1=req.getParameter("uname");
    String s2=req.getParameter("pass");
    out.println("<h1>"+s1+"</h1>");
    out.println("<h1>"+s1+"</h1>");
    out.println("<a href='index.html'>Back</a>");
    }

}