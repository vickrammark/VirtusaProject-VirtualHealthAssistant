package daobjects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataAccess
{
    private static ArrayList emp_id;

    public static  ArrayList getEmp_id()
    {
         emp_id=new ArrayList();
         emp_id.clear();
         try
         {
           Connection con=DBConnect.getCon();
           PreparedStatement pst=con.prepareStatement("select EID from tbl_emp_details");

           ResultSet rst=pst.executeQuery();

           while(rst.next())
           {
               emp_id.add(rst.getInt("eid"));
           }
         }
         catch(Exception ex)
         {
             System.out.println(ex);
         }
        return emp_id;
    }

    /**
     * @return the con
     */
}
