/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirutsaProject.virtual_health_assistant.Setter.acceptRequestSetter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class accpetRequestDao {
    
    public String setAcceptRequest(acceptRequestSetter as) throws SQLException
    {
        String result="";
        String date=as.getAppDate();
        String time=as.getAppTime();
        String id=as.getId();
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query1="set sql_safe_updates=0";
        String query="update pateint_doctor set appointmentDate=?,appointmentTime=?,confirmation=? where prescriptionId=?";
        PreparedStatement pre1=con.prepareStatement(query1);
        ResultSet res=pre1.executeQuery();
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1,date);
        pre.setString(2,time);
        pre.setString(3, "Yes");
        pre.setString(4,id);
        int count=pre.executeUpdate();
        if(count>0)
        {
            result="true";
            String query2="insert into confirmationappointment (prescriptionId,confirmation) values(?,?)";
            PreparedStatement pre2=con.prepareStatement(query2);
            pre2.setInt(1, Integer.parseInt(id));
            pre2.setString(2, "Yes");
            int n=pre2.executeUpdate();
            if(n==0)
            {
                return "false";
            }
            
            
        }
        else
        {
            result="false";
        }
        return result;
    }
}
