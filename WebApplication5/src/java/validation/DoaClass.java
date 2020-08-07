package validation;
import java.sql.*;

public class DoaClass {
    static  Connection con=null;
    public NewClass set_the_element(int pass,String name)
    {
        NewClass n=new NewClass();
        n.setName(name);
        n.setPass(pass);
        return n;
    }
    public void get_connect() throws ClassNotFoundException, SQLException
    {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
            String uname="root";
            String pass="pass123";
            con=DriverManager.getConnection(url,uname,pass);
    }
    public boolean checkpassword(NewClass n) throws ClassNotFoundException, SQLException
    {
     int Pass=n.getPass();
     get_connect();
     String query="select * from dbstudent where password='"+Pass+"'";
     Statement st=con.createStatement();
     ResultSet res=st.executeQuery(query);
     if(res.next())
     {
         return true;
     }
     else
     {
         return false;
     }
    }
}
