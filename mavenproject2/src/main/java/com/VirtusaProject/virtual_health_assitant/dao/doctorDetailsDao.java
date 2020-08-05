/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirtusaProject.virtual_health_assistant.modal.doctorDetailsModal;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author DELL
 */
public class doctorDetailsDao {

 public String setDoctorDeatils(doctorDetailsModal d) throws SQLException
 {
     String Fname=d.getFirst_name();
     String Lname=d.getLast_name();
     String birthdate=d.getBirth_date();
     String address=d.getAddress();
     String place_name=d.getPlace_name();
     String email=d.getEmail();
     String phonenumber=d.getPhone_number();
     String password=d.getPassword();
     String sex=d.getSex();
     String specialization=d.getSpecialization();
     String qualification=d.getQualification();
     int experience=d.getExperience();
     String hospital=d.getHospital();
     InputStream input=d.getInput();
     String success="";
                dataBaseConnection db=new dataBaseConnection();
                Connection con=db.getConnection();
                String query="select specialzationId from specialization where specialization_name=?";
                PreparedStatement pre=con.prepareStatement(query);
                pre.setString(1,specialization);
                ResultSet res=pre.executeQuery();
                int id=0;
                if(res.next())
                {
                    id=res.getInt("specialzationId");
                }
                else
                {
                    return "false1";
                }
                int hid=0;
                String query1="select hospital_id from hospital_details where hospital_name=?";
                PreparedStatement pre1=con.prepareStatement(query1);
                pre1.setString(1,hospital);
                ResultSet res1=pre1.executeQuery();
                if(res1.next())
                {
                    hid=res1.getInt("hospital_id");
                }
                else
                {
                    return hospital;
                }

                String query2="insert into doctor_details (first_name,last_name,birth_date,address,place_of_working,email,phone_number,password,sex,specialization,qualification,experience,photo,spceializationId,hospitalId) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pre2=con.prepareStatement(query2);
                pre2.setString(1,Fname);
                pre2.setString(2,Lname);
                pre2.setString(3,birthdate);
                pre2.setString(4,address);
                pre2.setString(5,place_name);
                pre2.setString(6,email);
                pre2.setString(7,phonenumber);
                pre2.setString(8,password);
                pre2.setString(9,sex);
                pre2.setString(10,specialization);
                pre2.setString(11,qualification);
                pre2.setInt(12,experience);
                pre2.setBinaryStream(13,input);
                pre2.setInt(14,id);
                pre2.setInt(15, hid);
                int n=pre2.executeUpdate();
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
