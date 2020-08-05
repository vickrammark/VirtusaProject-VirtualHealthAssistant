package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirutsaProject.virtual_health_assistant.Setter.cancelRequestSetter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cancelRequestDao {
    public String cancelRequest(cancelRequestSetter cs) throws SQLException
    {
        String result="";
        String id=cs.getId();
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="delete from pateint_doctor where prescriptionId=?";
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1, id);
        int count=pre.executeUpdate();
        if(count>0)
        {
        return "true";
        }
        else
        {
            return "false";         
        }
    }
}
