

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author DELL
 */
@WebServlet("/Newservlet1.java")
public class Newservlet1 extends HttpServlet {

    @Override
   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String s1=req.getParameter("uname");
        String s2=req.getParameter("pass");
        
        if(s1.equals("vickram") && s2.equals("123"))
        {
            req.setAttribute("k", "vickram");
            RequestDispatcher rd=req.getRequestDispatcher("/Newservlet2");
            rd.forward(req, resp);
        }
        else
        {
            RequestDispatcher rd=req.getRequestDispatcher("/index.html");
            rd.forward(req, resp);
        }
        out.close();
    }

}
