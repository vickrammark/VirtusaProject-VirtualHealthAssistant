/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.modal.appointmentModal;
import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirutsaProject.virtual_health_assistant.Setter.appointmentSetter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class appointmentDao {
    public String getAppointmentDeatils(appointmentSetter am) throws SQLException
    {
        String email=am.getEmail();
        String result="";
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="select pateintId from patient_details where email=?";
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1, email);
        ResultSet res=pre.executeQuery();
        int id=0;
        if(res.next())
        {
            id=res.getInt("pateintId");
        }
        String query3="select doctor_details.first_name,doctor_details.address,doctor_details.place_of_working,"
                              + "doctor_details.email,doctor_details.phone_number,doctor_details.sex,doctor_details.specialization,doctor_details.qualification,"
                              + "doctor_details.experience,pateint_doctor.prescriptionId,pateint_doctor.appointmentDate,"
                              + "pateint_doctor.appointmentReason,pateint_doctor.appointmentReason,pateint_doctor.appointmentTime,pateint_doctor.confirmation "
                              + "from virtual_health_assistant.doctor_details join pateint_doctor on pateint_doctor.doctorId = doctor_details.doctor_id "
                              + "join patient_details on patient_details.pateintId=pateint_doctor.patientId where pateint_doctor.patientId=?";
                PreparedStatement pre3=con.prepareStatement(query3);
                pre3.setInt(1, id);
                ResultSet res3=pre3.executeQuery();
       if(res3.next())
       {
           result=res3.getString("doctor_details.first_name")+","+res3.getString("doctor_details.address")+","+res3.getString("doctor_details.place_of_working")
                   +","+res3.getString("doctor_details.email")+","+res3.getString("doctor_details.phone_number")+","+res3.getString("doctor_details.sex")+","+res3.getString("doctor_details.specialization")+
                   ","+res3.getString("doctor_details.qualification")+","+res3.getString("doctor_details.experience")+","
                  +res3.getString("pateint_doctor.prescriptionId")+","+res3.getString("pateint_doctor.appointmentDate")+","+res3.getString("pateint_doctor.appointmentReason")
                  +","+res3.getString("pateint_doctor.appointmentTime")+","+res3.getString("pateint_doctor.confirmation")+"|";
         while(res3.next())
         {
             result=result+res3.getString("doctor_details.first_name")+","+res3.getString("doctor_details.address")+","+res3.getString("doctor_details.place_of_working")
                   +","+res3.getString("doctor_details.email")+","+res3.getString("doctor_details.phone_number")+","+res3.getString("doctor_details.sex")+","+res3.getString("doctor_details.specialization")+
                   ","+res3.getString("doctor_details.qualification")+","+res3.getString("doctor_details.experience")+","
                  +res3.getString("pateint_doctor.prescriptionId")+","+res3.getString("pateint_doctor.appointmentDate")+","+res3.getString("pateint_doctor.appointmentReason")
                  +","+res3.getString("pateint_doctor.appointmentTime")+","+res3.getString("pateint_doctor.confirmation")+"|";
         }
         
       }
       else
       {
           result="failed";
       }
       
                   return result; 
    }
    public String getConfirmedAppointment(appointmentSetter am) throws SQLException
    {
        String result="";
        String email=am.getEmail();
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="select pateintId from patient_details where email=?";
        PreparedStatement pre=con.prepareStatement(query);
        pre.setString(1, email);
        ResultSet res=pre.executeQuery();
        int id=0;
        if(res.next())
        {
            id=res.getInt("pateintId");
        }
        String query3="select doctor_details.first_name,doctor_details.address,doctor_details.place_of_working,"
                              + "doctor_details.email,doctor_details.phone_number,doctor_details.sex,doctor_details.specialization,doctor_details.qualification,"
                              + "doctor_details.experience,pateint_doctor.prescriptionId,pateint_doctor.appointmentDate,"
                              + "pateint_doctor.appointmentReason,pateint_doctor.appointmentReason,pateint_doctor.appointmentTime,pateint_doctor.confirmation "
                              + "from virtual_health_assistant.doctor_details join pateint_doctor on pateint_doctor.doctorId = doctor_details.doctor_id "
                              + "join patient_details on patient_details.pateintId=pateint_doctor.patientId where pateint_doctor.patientId=? and pateint_doctor.confirmation=?";
                PreparedStatement pre3=con.prepareStatement(query3);
                pre3.setInt(1, id);
                pre3.setString(2, "Yes");
                ResultSet res3=pre3.executeQuery();
       if(res3.next())
       {
           result=res3.getString("doctor_details.first_name")+","+res3.getString("doctor_details.address")+","+res3.getString("doctor_details.place_of_working")
                   +","+res3.getString("doctor_details.email")+","+res3.getString("doctor_details.phone_number")+","+res3.getString("doctor_details.sex")+","+res3.getString("doctor_details.specialization")+
                   ","+res3.getString("doctor_details.qualification")+","+res3.getString("doctor_details.experience")+","
                  +res3.getString("pateint_doctor.prescriptionId")+","+res3.getString("pateint_doctor.appointmentDate")+","+res3.getString("pateint_doctor.appointmentReason")
                  +","+res3.getString("pateint_doctor.appointmentTime")+","+res3.getString("pateint_doctor.confirmation")+"|";
         while(res3.next())
         {
             result=result+res3.getString("doctor_details.first_name")+","+res3.getString("doctor_details.address")+","+res3.getString("doctor_details.place_of_working")
                   +","+res3.getString("doctor_details.email")+","+res3.getString("doctor_details.phone_number")+","+res3.getString("doctor_details.sex")+","+res3.getString("doctor_details.specialization")+
                   ","+res3.getString("doctor_details.qualification")+","+res3.getString("doctor_details.experience")+","
                  +res3.getString("pateint_doctor.prescriptionId")+","+res3.getString("pateint_doctor.appointmentDate")+","+res3.getString("pateint_doctor.appointmentReason")
                  +","+res3.getString("pateint_doctor.appointmentTime")+","+res3.getString("pateint_doctor.confirmation")+"|";
         }
         
       }
       else
       {
           result="failed";
       }
       
                   return result;   
    }
}
