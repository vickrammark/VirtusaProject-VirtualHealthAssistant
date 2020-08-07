/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class firstservlet extends HttpServlet {

public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String user = request.getParameter("uname");
String pass = request.getParameter("pass");
out.println("<h1>"+user+"</h1>");
out.println("<h1>"+pass+"</h1>");
out.println("<a href='index.html'>Back</a>");
out.close();
}
} 


