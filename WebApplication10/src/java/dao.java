
import intialValues.DataValues;
import java.io.IOException;
import java.io.PrintWriter;
import signUp.DBConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.sql.*;
import javax.servlet.http.HttpServletResponse;
public class dao {
 
    public DataValues getDetails(String Name,String Email,String Password)
    {
        DataValues cont=new DataValues();
        cont.setFIRST_NAME(Name);
        cont.setEMAIL(Email);
        cont.setPASSWRD(Password);
        return cont;
    }
    public String  set_the_Details(DataValues data) throws ClassNotFoundException, SQLException
    {
        String Name=data.getFIRST_NAME();
        String Email=data.getEMAIL();
        String Password=data.getPASSWRD();
        if(Name.length()!=0 || Email.length()!=0||Password.length()!=0)
        { 
        DBConnection db=new DBConnection();
        Connection con=db.getDBConnection();
        String query="insert into employeedetails (FIRST_NAME,EMAIL,PASSWRD)values(?,?,?)";
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1, Name);
        pre.setString(2, Email);
        pre.setString(3, Password);
        pre.executeUpdate();
        con.close();
        return "success";
        }
        else
        {
            return "false";
        }
                
    }
    public String saveDetails(String s1,String s2,String s3,String s4,String s5,String s6,String s7,HttpServletResponse resp) throws ClassNotFoundException, SQLException, IOException
    {
     String result="";
        PrintWriter out=resp.getWriter();
      DBConnection db=new DBConnection();
      Connection con=db.getDBConnection();
      try
      {    
      String query="update employeedetails set LAST_NAME=?,GENDER=?,DOB=?,MOBILE=?,CITY=?,STATE=? where FIRST_NAME=?";
      PreparedStatement pre=con.prepareStatement(query);        
      pre.setString(1, s2);
      pre.setString(2, s3);
      pre.setString(3, s4);
      pre.setString(4, s5);
      pre.setString(5, s6);
      pre.setString(6, s7);
      pre.setString(7, s1);
      pre.executeUpdate();
      con.close();
      return "successfully saved";
      }
      catch(Exception ex)
      {
          out.println(ex.getMessage());
      }
      return "successfully saved";
    }
}
//update employeedetails set LAST_NAME="sankar" GENDER="male" DOB="19/8/1968" MOBILE="9965997556" CITY="dindugul" STATE="tamilnadu" where FIRST_NAME="thangavel"