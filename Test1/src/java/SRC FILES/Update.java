import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import daobjects.DBConnect;
public class Update extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();


     Connection co;
     PreparedStatement pst;

     try
     {
      int eid=Integer.parseInt(request.getParameter("eid").trim());
      String email=request.getParameter("email");
      double mobile=Double.parseDouble(request.getParameter("mobile").trim());
      String city=request.getParameter("city");
      String state=request.getParameter("state");

      co=DBConnect.getCon();
      pst=co.prepareStatement("update tbl_emp_details set EMAIL=?,MOBILE=?,CITY=?,STATE=? where EID=?");

      pst.setString(1,email);
      pst.setDouble(2,mobile);
      pst.setString(3,city);
      pst.setString(4,state);
      pst.setInt(5,eid);

      pst.executeUpdate();

      co.close();
      out.println("<h1>Successfully Updated!</h1>");
      out.println("<a href='UpdateEmployee.jsp'>Back</a>");
     }
     catch(Exception e)
     {
       out.println("     "+e);
     }
     out.close();
    }
}
