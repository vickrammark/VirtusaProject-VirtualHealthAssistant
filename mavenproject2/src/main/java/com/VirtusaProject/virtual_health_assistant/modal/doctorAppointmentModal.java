/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.modal;

import com.VirutsaProject.virtual_health_assistant.Setter.doctorAppointmentSetter;

/**
 *
 * @author DELL
 */
public class doctorAppointmentModal {
    
    public doctorAppointmentSetter getAppointment(String email)
    {
        doctorAppointmentSetter ds=new doctorAppointmentSetter();
        ds.setEmail(email);
        return ds;
    }
}
