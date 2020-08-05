/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirutsaProject.virtual_health_assistant.Setter;

import com.VirtusaProject.virtual_health_assistant.modal.doctorDetailsModal;
import com.VirtusaProject.virtual_health_assistant.modal.doctorDetailsModal;
import java.io.InputStream;

/**
 *
 * @author DELL
 */
public class doctorDeatilsSetter {
    
  public doctorDetailsModal setDoctorDetails(String first_name,String last_name,String birth_date,String addres,String place_name,String email,String password,String phone_number,String sex,String specialization,String hospital,String qualification,int experience,InputStream input)
  {
    doctorDetailsModal dm=new doctorDetailsModal();
    dm.setFirst_name(first_name);
    dm.setLast_name(last_name);
    dm.setBirth_date(birth_date);
    dm.setAddress(addres);
    dm.setPlace_name(place_name);
    dm.setEmail(email);
    dm.setPassword(password);
    dm.setPhone_number(phone_number);
    dm.setSex(sex);
    dm.setSpecialization(specialization);
    dm.setHospital(hospital);
    dm.setQualification(qualification);
    dm.setExperience(experience);
    dm.setInput(input);
    return dm;
  }
    
}
