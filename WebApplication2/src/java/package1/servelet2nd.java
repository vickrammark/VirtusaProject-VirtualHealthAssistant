/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/WebApplication2")
public class servelet2nd extends GenericServlet{
public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String s1=request.getParameter("uname");
String s2=request.getParameter("pass");
out.println("<h1>"+s1+"</h1>");
out.println("<h1>"+s2+"</h1>");
out.println("<a href='index.html'>Back</a>");
out.close();
}
}