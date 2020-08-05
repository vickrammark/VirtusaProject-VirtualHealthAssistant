/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.modal.patientDetailsModal;
import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirutsaProject.virtual_health_assistant.Setter.patientDataHelperSetter;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class patientDetailsDao {
    public String setPateintDetails(patientDetailsModal pm) throws SQLException
    {
        String success;
        String Fname=pm.getFirst_name();
        String Lname=pm.getLast_name();
        String birthdate=pm.getBirthdate();
        String occupation=pm.getOccupation();
        String sex=pm.getSex();
        String email=pm.getEmail();
        String password=pm.getPassword();
        String phonenumber=pm.getPhone_number();
        String address=pm.getAddress();
        String place_name=pm.getPlace_name();
        int age=pm.getAge();
        int height=pm.getHeight();
        int weight=pm.getWeight();
        String bloodtype=pm.getBlood_group();
        String body_marks=pm.getBody_marks();
        InputStream input=pm.getInput();
             dataBaseConnection db=new dataBaseConnection();
           
                Connection con=db.getConnection();
                String query="insert into patient_details (first_name,last_name,birthdate,occupation,sex,email,password,phone_number,address,place_name,age,height,weight,blood_group,body_marks,photo)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pre=con.prepareStatement(query);
                pre.setString(1,Fname);
                pre.setString(2,Lname);
                pre.setString(3,birthdate);
                pre.setString(4,occupation);
                pre.setString(5,sex);
                pre.setString(6,email);
                pre.setString(7,password);
                pre.setString(8,phonenumber);
                pre.setString(9,address);
                pre.setString(10,place_name);
                pre.setInt(11,age);
                pre.setInt(12,height);
                pre.setInt(13,weight);
                pre.setString(14,bloodtype);
                pre.setString(15,body_marks);
                pre.setBinaryStream(16,input);
                int n=pre.executeUpdate();
                if(n>0)
                {
                    success="true";
                }
                else
                {
                    success="false";
                }
           
        return success;
    }
    
}
