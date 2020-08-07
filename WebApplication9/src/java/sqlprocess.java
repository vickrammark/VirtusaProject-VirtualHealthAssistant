
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sqlprocess {
 public void sqlprocess(studentclassdb d,HttpServletResponse resp,HttpServletRequest req) throws Exception
    {
        
        Class.forName("com.mysql.jdbc.Driver");
        PrintWriter out=resp.getWriter();
        String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
        String uname="root";
        String pass="pass123";
        Connection con=DriverManager.getConnection(url,uname,pass);
     
            sqlprocess l=new sqlprocess();
            String name=d.getName();
            int rollno=d.getRollno();
            Statement st=con.createStatement();
            String query="select rollno from dbstudent where name='"+name+"'";
            ResultSet s1=st.executeQuery(query);
              s1.next();
            int resultrollno=s1.getInt("rollno");
            if(rollno==resultrollno )
            {
                HttpSession session=req.getSession();           
                session.setAttribute("name", name);
                req.setAttribute("name", name);
                RequestDispatcher rd=req.getRequestDispatcher("/loginpage.jsp");
                rd.forward(req, resp);
               
            } 
            else
            {
                            RequestDispatcher rd=req.getRequestDispatcher("/index.html");
           rd.forward(req, resp);

               
               
           }
            }
        
    }   

