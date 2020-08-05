/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirutsaProject.virtual_health_assistant.Setter.NotificationSetter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class NotificationDao {
    public int setNotification(NotificationSetter ns,String role) throws SQLException
    {
     String email=ns.getEmail();
     dataBaseConnection db=new dataBaseConnection();
     Connection con=db.getConnection(); 
           int count=0;
     if(role.equals("doctor"))
     {    
     String query="select doctor_id from doctor_details where email=?";
     PreparedStatement pre=con.prepareStatement(query);
     pre.setString(1,email);
     ResultSet res=pre.executeQuery();
     int id=0;
     if(res.next())
     {
         id=res.getInt("doctor_id");
     }
     String query1="select patientId from pateint_doctor where doctorId=? and confirmation=?";
     PreparedStatement pre1=con.prepareStatement(query1);
     pre1.setInt(1,id);
     pre1.setString(2,"No");
     ResultSet res1=pre1.executeQuery();
    
     while(res1.next())
     {
         count=count+1;
     }
     return count;
    }
     else if(role.equals("patient"))
     {
     String query="select pateintId from patient_details where email=?";
     PreparedStatement pre=con.prepareStatement(query);
     pre.setString(1,email);
     ResultSet res=pre.executeQuery();
     int id=0;
     if(res.next())
     {
         id=res.getInt("pateintId");
     }
     String query1="select doctorId from pateint_doctor where patientId=? and confirmation=?";
     PreparedStatement pre1=con.prepareStatement(query1);
     pre1.setInt(1,id);
     pre1.setString(2,"No");
     ResultSet res1=pre1.executeQuery();
     while(res1.next())
     {
         count=count+1;
     }
     return count; 
     }
     return count;
     }
}
