

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginCheck")

public class loginCheck extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String s1=req.getParameter("uname");
        String s2=req.getParameter("pass");
        if(s1.equals("Vickram") && s2.equals("123"))
        {
              out.println("<h1>"+s1+"</h1>");
    
            RequestDispatcher rd=req.getRequestDispatcher("/loginpage.jsp");
            rd.forward(req, resp);
        }
        else
        {
           RequestDispatcher rd=req.getRequestDispatcher("/index.html");
          rd.forward(req, resp);    
        }
      out.println("<h1>"+s1+"</h1>");
    }

   
}
