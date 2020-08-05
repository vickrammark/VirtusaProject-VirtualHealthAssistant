/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assitant.dao;

import com.VirtusaProject.virtual_health_assistant.modal.doctorAppointmentModal;
import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirutsaProject.virtual_health_assistant.Setter.doctorAppointmentSetter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class doctorAppointmentDao {
    
    public String getAppointmentDetails(doctorAppointmentSetter dm) throws SQLException
    {
       String result="";
       String email=dm.getEmail();
        dataBaseConnection db=new dataBaseConnection();
        Connection con=db.getConnection();
        String query="select doctor_id from doctor_details where email=?";
        PreparedStatement pre =con.prepareStatement(query);
        pre.setString(1, email);
        ResultSet res=pre.executeQuery();
        int id=0;
        if(res.next())
        {
            id=res.getInt("doctor_id");
        }
        String query1="select patient_details.first_name,patient_details.email,patient_details.phone_number,patient_details.address,patient_details.place_name,pateint_doctor.prescriptionId,pateint_doctor.appointmentDate,pateint_doctor.appointmentReason,pateint_doctor.appointmentTime,pateint_doctor.confirmation from patient_details join pateint_doctor on pateint_doctor.patientId=patient_details.pateintId join doctor_details on doctor_details.doctor_id=pateint_doctor.doctorId where pateint_doctor.doctorId=? and pateint_doctor.confirmation=?;";
        PreparedStatement pre1=con.prepareStatement(query1);
        pre1.setInt(1, id);
        pre1.setString(2,"No");
        ResultSet res1=pre1.executeQuery();
        int count=0;
        if(res1.next())
        {
                    count=1;
            result=res1.getString("patient_details.first_name")+","+res1.getString("patient_details.email")+","+res1.getString("patient_details.phone_number")+","+res1.getString("patient_details.address")+","+res1.getString("patient_details.place_name")+","+res1.getString("pateint_doctor.prescriptionId")+","+res1.getString("pateint_doctor.appointmentDate")+","+res1.getString("pateint_doctor.appointmentReason")+","+res1.getString("pateint_doctor.appointmentTime")+","+res1.getString("pateint_doctor.confirmation")+"|";
            while(res1.next())
            {
                result=result+res1.getString("patient_details.first_name")+","+res1.getString("patient_details.email")+","+res1.getString("patient_details.phone_number")+","+res1.getString("patient_details.address")+","+res1.getString("patient_details.place_name")+","+res1.getString("pateint_doctor.prescriptionId")+","+res1.getString("pateint_doctor.appointmentDate")+","+res1.getString("pateint_doctor.appointmentReason")+","+res1.getString("pateint_doctor.appointmentTime")+","+res1.getString("pateint_doctor.confirmation")+"|";
            }
        }
        return result;
    }
}
