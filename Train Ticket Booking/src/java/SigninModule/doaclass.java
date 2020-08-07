package SigninModule;

import java.sql.*;

public class doaclass {
    static Connection con=null;
    public static signinCheck setElement(String name,int pass,String email)
    {
        signinCheck s=new signinCheck();
        s.setName(name);
        s.setPassword(pass);  
        s.setEmail(email);
        return s;
    }   
    public static void getConnect() throws ClassNotFoundException, SQLException
    {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/trainticket?autoReconnect=true&useSSL=false";
            String uname="root";
            String pass="pass123";
            con=DriverManager.getConnection(url,uname,pass);
    }
    public static boolean signin(signinCheck s) throws ClassNotFoundException, SQLException
    {
        getConnect();
        String Name=s.getName();
        String query="select * from train where name=+'"+Name+"'";
        Statement st=con.createStatement();
        ResultSet res=st.executeQuery(query);
        if(res.next()==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void insert(signinCheck s) throws ClassNotFoundException, SQLException
    {
        getConnect();
        Statement st=con.createStatement();
        String query="insert into train values("+"'"+s.getName()+"'"+","+s.getPassword()+","+"'"+s.getEmail()+"'"+")";
        int res=st.executeUpdate(query);       

    }

}
