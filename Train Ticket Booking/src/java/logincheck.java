
import SigninModule.doaclass;
import SigninModule.signinCheck;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/logincheck"})
public class logincheck extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String name=req.getParameter("uname");
        int password=Integer.parseInt(req.getParameter("pass"));
        String email=req.getParameter("email");
        doaclass d=new doaclass();
        signinCheck s=d.setElement(name,password,email);   
        boolean b=false;
        try {
           b=d.signin(s);
        } catch (Exception ex) {
              out.print(ex.getMessage());
        }
         req.setAttribute("details", s);
        if(b==true)
        {
            RequestDispatcher rd=req.getRequestDispatcher("signinPages/signinExsist.jsp");
            rd.forward(req, resp);
        }
        else
        {
            RequestDispatcher rd=req.getRequestDispatcher("signinPages/signinSuccess.jsp");
            rd.forward(req, resp);    
        }
    
    }


}
