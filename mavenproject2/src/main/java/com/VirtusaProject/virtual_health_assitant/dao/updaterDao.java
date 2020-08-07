/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirutsaProject.virtual_health_assistant.Setter.updaterSetter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class updaterDao {
    public String updateAppointment(updaterSetter up) throws SQLException
    {
        String result="";
        int presId=Integer.parseInt(up.getPresId());
        String AppDate=up.getAppDate();
        String AppTime=up.getAppTime();
        String AppConfirmation=up.getAppConfirmation();
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="set sql_safe_updates=0";
        String query1="update pateint_doctor set appointmentDate=?,appointmentTime=?,confirmation=? where prescriptionId=?";
        PreparedStatement pre=con.prepareStatement(query);
        PreparedStatement pre1=con.prepareStatement(query1);
        pre1.setString(1,AppDate);
        pre1.setString(2,AppTime);
        pre1.setString(3,AppConfirmation);
        pre1.setInt(4,presId);
        int count=pre1.executeUpdate();
        if(count>0)
        {
            result="true";
        }
        else
        {
            result="false";
        }
        return result;
    }
}
