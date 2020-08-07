import daobjects.DBConnect;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginValidation extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
      HttpSession session=request.getSession(true);
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      String details="";
      boolean check=false;
     
      if(!request.getParameter("eid").equals("0"))
      {
       int eid=Integer.parseInt(request.getParameter("eid").trim());
       String pwd=request.getParameter("passwrd");
       try
       {
        Connection con=DBConnect.getCon();
        PreparedStatement pst;
        ResultSet rst;

        pst=con.prepareStatement("select * from tbl_emp_details where EID=? and PASSWRD=?");
        pst.setInt(1, eid);
        pst.setString(2, pwd);

        rst=pst.executeQuery();

        if(rst.next())
        {
            check=true;
            session.setAttribute("eid_session", eid);
            RequestDispatcher rd=request.getRequestDispatcher("/DisplayDetails.jsp");
            rd.forward(request, response);
        }

        if(!check)
        {
            out.println("No Details");
        }

        con.close();
       }
       catch(Exception ex)
       {
          out.println("  "+ex);
       }
       finally
       {

       }
      }
      out.println(details);
      out.close();
    }
}
