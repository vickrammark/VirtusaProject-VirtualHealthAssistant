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
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author DELL
 */
@WebServlet("/Newservlet2.java")
public class Newservlet2 extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
    String s=(String)request.getAttribute("k");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<h1> Validation Success! </h1>");
out.println("<h1>"+s+ "</h1>");
out.println("<a href='index.html'>Back</a>");
out.close();
}
}
