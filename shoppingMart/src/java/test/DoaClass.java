package test;





import test.validationClass;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class DoaClass {
    public validationClass get_the_element(String name,int qty,HttpServletResponse resp ) throws IOException
    {
        PrintWriter out=resp.getWriter();
           
        validationClass v1=new validationClass();
        v1.setName(name);
        v1.setQty(qty);
        return v1;
    
    }
  
    public boolean availability(validationClass v,HttpServletResponse resp ) throws IOException, ClassNotFoundException, SQLException 
     {
            PrintWriter out=resp.getWriter();
            String result=null;
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
            String uname="root";
            String pass="pass123";
            Connection con=DriverManager.getConnection(url,uname,pass);
            String name=v.getName();
            Statement st=con.createStatement();
            String query="select price from product where productname='"+name+"'";
            ResultSet s1=st.executeQuery(query);
            if(s1.next())
            {
                return true;
            }
            return false;
     }
    public int pricedtails(validationClass v,HttpServletResponse resp) throws SQLException, ClassNotFoundException, IOException
    {
        
            PrintWriter out=resp.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
            String uname="root";
            String pass="pass123";
            Connection con=DriverManager.getConnection(url,uname,pass);
            String name=v.getName();
            Statement st=con.createStatement();
            String query="select price from product where productname='"+name+"'";
            ResultSet s1=st.executeQuery(query);
            s1.next();
            int price=Integer.parseInt(s1.getString("price"));
                        
            return price;
    }
}


