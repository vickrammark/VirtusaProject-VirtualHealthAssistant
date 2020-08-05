/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirutsaProject.virtual_health_assistant.Setter;

import com.VirtusaProject.virtual_health_assistant.modal.patientDetailsModal;
import java.io.InputStream;

/**
 *
 * @author DELL
 */
public class patientDataHelperSetter {
    
    public patientDetailsModal setPatientDetails(String first_name,String last_name,String birthdate,String occupation,String sex,String email,String password,String phone_number,String address,String place_name,int age,int height,int weight,String blood_group,String body_marks,InputStream input )
    {
        patientDetailsModal pd=new patientDetailsModal();
        pd.setFirst_name(first_name);
        pd.setLast_name(last_name);
        pd.setBirthdate(birthdate);
        pd.setOccupation(occupation);
        pd.setEmail(email);
        pd.setSex(sex);
        pd.setPassword(password);
        pd.setPhone_number(phone_number);
        pd.setAddress(address);
        pd.setPlace_name(place_name);
        pd.setAge(age);
        pd.setHeight(height);
        pd.setWeight(weight);
        pd.setBlood_group(blood_group);
        pd.setBody_marks(body_marks);
        pd.setInput(input);
        return pd;
    }
}
