/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author DELL
 */
public class nameRetriver {

    public String getName(String email,String role) throws SQLException
  {
      dataBaseConnection db=new dataBaseConnection();
      Connection con=db.getConnection();
      String result="";
      String query="";
      if(role.equals("patient"))
      {    
      query="select first_name from patient_details where email=?";
      }
      else if(role.equals("doctor"))
      {
      query="select first_name from doctor_details where email=?";    
      }
      else
      {
          return "sorry user dont exist";
      }
      PreparedStatement pre=con.prepareStatement(query);
      pre.setString(1, email);
      ResultSet res=pre.executeQuery();
      if(res.next())
      {
       result=res.getString("first_name");   
      }
      return result;
  }
  public String getProfile(String email,String role) throws SQLException
  {
      dataBaseConnection db=new dataBaseConnection();
      Connection con=db.getConnection();
      String result="";
      if(role.equals("patient"))
      {    
      String query="select first_name,last_name,birthdate,occupation,sex,email,phone_number,address,place_name,age,height,weight,blood_group,body_marks,comment from patient_details where email=?" ;      
      PreparedStatement pre=con.prepareStatement(query);
      pre.setString(1, email);
      ResultSet res=pre.executeQuery();
      if(res.next())
      {
          result=res.getString("first_name")+","
                  +res.getString("last_name")+","
                  +res.getString("birthdate")+","
                  +res.getString("occupation")+","
                  +res.getString("sex")+","
                  +res.getString("email")+","
                  +res.getString("phone_number")+","
                  +res.getString("address")+","
                  +res.getString("place_name")+","
                  +res.getString("age")+","
                  +res.getString("height")+","
                  +res.getString("weight")+","
                  +res.getString("blood_group")+","
                  +res.getString("body_marks");
      }
      else
      {
          result="false "+email;
      }
      }
      else
      {
   String query="select first_name,last_name,birth_date,address,place_of_working,email,phone_number,sex,specialization,qualification,experience from doctor_details where email=?" ;      
      PreparedStatement pre=con.prepareStatement(query);
      pre.setString(1, email);
      ResultSet res=pre.executeQuery();
      if(res.next())
      {
          result=res.getString("first_name")+","
                  +res.getString("last_name")+","
                  +res.getString("birth_date")+","
                  +res.getString("address")+","
                  +res.getString("place_of_working")+","
                  +res.getString("email")+","
                  +res.getString("phone_number")+","
                  +res.getString("sex")+","
                  +res.getString("specialization")+","
                  +res.getString("qualification")+","
                  +res.getString("experience");
      }
      else
      {
          result="false";
      }        
      }
      return result;
  }
  public String updator(String fname,String lname,String birhtdate,String occupation,String sex,String mainEmail,String email,String phonenumber,String address,String placeName,int age ,int height,int weight,String bloodGroup,String bodymaks) throws SQLException{

                  String result="";
                   dataBaseConnection db=new dataBaseConnection();
        
                Connection con=db.getConnection();
                String query1="set sql_safe_updates=0"; 
                String query="update  patient_details set first_name=?,last_name=?,birthdate=?,occupation=?,sex=?,email=?,phone_number=?,address=?,place_name=?,age=?,height=?,weight=?,blood_group=?,body_marks=? where email=?";
                PreparedStatement pre1=con.prepareStatement(query1);
                PreparedStatement pre=con.prepareStatement(query);
                pre.setString(1,fname);
                pre.setString(2,lname);
                pre.setString(3,birhtdate);
                pre.setString(4,occupation);
                pre.setString(5,sex);
                pre.setString(6,email);
                pre.setString(7,phonenumber);
                pre.setString(8,address);
                pre.setString(9,placeName);
                pre.setInt(10,age);
                pre.setInt(11,height);
                pre.setInt(12,weight);
                pre.setString(13,bloodGroup);
                pre.setString(14,bodymaks);
                pre.setString(15,mainEmail);
                ResultSet res=pre1.executeQuery();
                int n=pre.executeUpdate();
                if(n>0)
                {
                    result="true";
                }
                else
                {
                    result="false";
                }        
                 return result;
    }
  public String updator_docotor(String fname,String lname,String birthdate,String address,String placeName,String email,String phoneNumber,String sex,String specialization,String qualification,String experience,String mainEmail) throws SQLException
  {
      String result="";
      dataBaseConnection db=new dataBaseConnection();
      Connection con=db.getConnection();
      String query="set sql_safe_updates=0";
      String query1="update doctor_details set first_name=?,last_name=?,birth_date=?,address=?,place_of_working=?,email=?,phone_number=?,sex=?,specialization=?,qualification=?,experience=? where email=?";
      PreparedStatement pre=con.prepareStatement(query);
      PreparedStatement pre1=con.prepareStatement(query1);
      pre1.setString(1, fname);
      pre1.setString(2, lname);
      pre1.setString(3, birthdate);
      pre1.setString(4, address);
      pre1.setString(5,placeName);
      pre1.setString(6, email);
      pre1.setString(7, phoneNumber);
      pre1.setString(8, sex);
      pre1.setString(9, specialization);
      pre1.setString(10,qualification);
      pre1.setString(11, experience);
      pre1.setString(12, mainEmail);
      ResultSet res=pre.executeQuery();
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
