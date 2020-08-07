
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;
import signUp.DBConnection;


public class EIDhelper {
   public static ArrayList getEid(HttpServletResponse resp) throws IOException
   {
       PrintWriter out=resp.getWriter();
        ArrayList EIDarray = new ArrayList();
         try {
            DBConnection db=new DBConnection();
            Connection con=db.getDBConnection();
            String query="select EID from employeedetails";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
                while(rs.next())
                {
                    EIDarray.add(rs.getString("EID"));
                }
        } catch (Exception ex) {
            out.println(ex.getMessage());
        } 
        return EIDarray;
   }
   public static String getEmployeeDeatils(String data,HttpServletResponse resp) throws ClassNotFoundException, SQLException, IOException
   {
    String result="";
    PrintWriter out=resp.getWriter();   
    try
    {    
    int key=Integer.parseInt(data);
    DBConnection db=new DBConnection();
    Connection con=db.getDBConnection();
    String query="select FIRST_NAME,LAST_NAME,GENDER,DOB,PASSWRD,EMAIL,MOBILE,CITY,STATE from employeedetails where EID='"+key+"'";
     Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
                if(rs.next())
                {
                   result=result+rs.getString("FIRST_NAME")+"||"+rs.getString("LAST_NAME")+"||"+rs.getString("GENDER")+"||"+rs.getString("DOB")+"||"+rs.getString("PASSWRD")+"||"+rs.getString("EMAIL")+"||"+rs.getString("MOBILE")+"||"+rs.getString("CITY")+"||"+rs.getString("STATE");
                }
                else
                {
                    result=String.valueOf(key);
                }
             }
    catch(Exception ex)
    {
        out.println(ex.getMessage()+" hello");
    }   
    return result;
    
     
   }

 
}
//select FIRST_NAME,LAST_NAME,GENDER,DOB,PASSWRD,EMAIL,MOBILE,CITY,STATE from employeedetails where EID=1001;