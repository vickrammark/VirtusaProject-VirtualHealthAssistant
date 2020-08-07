import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import daobjects.DataAccess;
import java.util.ArrayList;
public class EIDLoad extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {

      ArrayList al=DataAccess.getEmp_id();

      response.setContentType("text/html");
      PrintWriter out=response.getWriter();

      String lvalue;

      out.println("<select name='eid' onchange='getEmpDetails(this.value)'>");
      out.println("<option value='0'>Select</option>");
      for(int i=0;i<al.size();i++)
      {
         lvalue=al.get(i).toString();
         out.println("<option value="+lvalue+">"+lvalue+"</option>");
      }
      out.println("</select>");
      out.close();
    }
}
