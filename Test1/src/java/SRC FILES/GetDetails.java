import daobjects.DBConnect;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class GetDetails extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      String details="";
      boolean check=false;
      if(!request.getParameter("eid").equals("0"))
      {
       int eid=Integer.parseInt(request.getParameter("eid"));
      
       try
       {
        Connection con=DBConnect.getCon();
       
        PreparedStatement pst=con.prepareStatement("select FIRST_NAME,LAST_NAME,GENDER,DOB,EMAIL,MOBILE,CITY,STATE from tbl_emp_details where EID=?");
        pst.setInt(1, eid);

        ResultSet rst=pst.executeQuery();

        
        if(rst.next())
        {
            details=rst.getString("FIRST_NAME")+"||"
                    +rst.getString("LAST_NAME")+"||"
                    +rst.getString("GENDER")+"||"
                    +rst.getString("DOB")+"||"
                    +rst.getString("EMAIL")+"||"
                    +rst.getString("MOBILE")+"||"
                    +rst.getString("CITY")+"||"
                    +rst.getString("STATE");

                    
            check=true;
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
       if(!check)
       {
            details="----"+"||"+"----"+"||"+"----"+"||"+"----"+"||"+"----"+"||"+"----"+"||"+"----"+"||"+"----";
       }
      out.println(details);
      out.close();
    }
}
