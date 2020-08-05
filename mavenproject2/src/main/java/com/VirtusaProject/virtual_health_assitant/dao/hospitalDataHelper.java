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

/**
 *
 * @author DELL
 */
public class hospitalDataHelper {
 
    public String getHospitalDeatils(String place_name,String specName) throws SQLException
    {
        String result="";
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="select specialzationId from specialization where specialization_name=?";
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1,specName);
        ResultSet res=pre.executeQuery();
        int id;
        if(res.next())
        {
            id=res.getInt("specialzationId");
        }
        else
        {
            return "sorry cant find any matched items";
        }
        String query1="select hospital_id,hospital_name,address,found_date,spceializationId,doctorNumber,nurses,rooms,beds,floors,place,contact_number,ICU_wards,operation_theater,Test_labs from hospital_details where place=? and spceializationId=?";
        PreparedStatement pre1=con.prepareStatement(query1);      
        pre1.setString(1,place_name);
        pre1.setInt(2, id);
        ResultSet res1=pre1.executeQuery();
        if(res1.next())
        {
           result=res1.getString("hospital_id")+","+
                   res1.getString("hospital_name")+","
                  +res1.getString("address")+","
                  +res1.getString("found_date")+","
                  +res1.getInt("doctorNumber")+","
                  +res1.getInt("nurses")+","
                  +res1.getInt("rooms")+","
                  +res1.getInt("beds")+","
                  +res1.getInt("floors")+","
                  +res1.getString("place")+","
                  +res1.getString("contact_number")+","
                  +res1.getInt("ICU_wards")+","
                  +res1.getInt("operation_theater")+","
                  +res1.getInt("Test_labs")+"|"; 
           while(res1.next())
           {   
            result=result+res1.getString("hospital_id")+","
                  +res1.getString("hospital_name")+","
                  +res1.getString("address")+","
                  +res1.getString("found_date")+","
                  +res1.getInt("doctorNumber")+","
                  +res1.getInt("nurses")+","
                  +res1.getInt("rooms")+","
                  +res1.getInt("beds")+","
                  +res1.getInt("floors")+","
                  +res1.getString("place")+","
                  +res1.getString("contact_number")+","
                  +res1.getInt("ICU_wards")+","
                  +res1.getInt("operation_theater")+","
                  +res1.getInt("Test_labs")+"|";
           }
        }
        else
        {
            result="Sorry No Availabale Hospitals";            
        }
        return result;
    }
    public String getDoctors(String specName,String hospitalId) throws SQLException
    {
        String result="";
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="select specialzationId from specialization where specialization_name=?";
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1,specName);
        ResultSet res=pre.executeQuery();
        int id;
        if(res.next())
        {
            id=res.getInt("specialzationId");
        }
        else
        {
            return "sorry cant find any matched items";
        }
        String query1="select doctor_id,first_name,address,place_of_working,email,phone_number,sex,specialization,qualification,experience from doctor_details where hospitalId=? and spceializationId=?";
        PreparedStatement pre1=con.prepareStatement(query1);      
        pre1.setString(1,hospitalId);
        pre1.setInt(2, id);
        ResultSet res1=pre1.executeQuery();
        if(res1.next())
        {
          result=res1.getString("doctor_id")+","+res1.getString("first_name")+","+
                   res1.getString("address")+","
                  +res1.getString("place_of_working")+","
                  +res1.getString("email")+","
                  +res1.getString("phone_number")+","
                  +res1.getString("sex")+","
                  +res1.getString("specialization")+","
                  +res1.getString("qualification")+","
                  +res1.getString("experience")+"|";    
          while(res1.next())
          {
          result=result+res1.getString("doctor_id")+","+res1.getString("first_name")+","+
                   res1.getString("address")+","
                  +res1.getString("place_of_working")+","
                  +res1.getString("email")+","
                  +res1.getString("phone_number")+","
                  +res1.getString("sex")+","
                  +res1.getString("specialization")+","
                  +res1.getString("qualification")+","
                  +res1.getString("experience")+"|";         
          }
        }
        return result; 
    }
    public String getHospital(String specName,String placeName) throws SQLException
    {
        String result="";
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="select specialzationId from specialization where specialization_name=?";
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1,specName);
        ResultSet res=pre.executeQuery();
        int id;
        if(res.next())
        {
            id=res.getInt("specialzationId");
        }
        else
        {
            return "sorry cant find any matched items";
        }
        String query1="select hospital_name from hospital_details where spceializationId=? and place=?";
        PreparedStatement pre1=con.prepareStatement(query1);
        pre1.setInt(1,id);
        pre1.setString(2,placeName);
        ResultSet res1=pre1.executeQuery();
        if(res1.next())
        {
            result=res1.getString("hospital_name")+"|";
            while(res1.next())
            {
                result=result+res1.getString("hospital_name")+"|";
            }
        }
        else
        {
            result="false";
        }
        return result;
    }
}
