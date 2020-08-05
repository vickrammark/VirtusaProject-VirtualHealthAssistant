/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.modal;

import com.VirutsaProject.virtual_health_assistant.Setter.appointmentSetter;

/**
 *
 * @author DELL
 */
public class appointmentModal {
    public appointmentSetter getAppointmentEmail(String email)
    {
        appointmentSetter ap=new appointmentSetter();
        ap.setEmail(email);
        return ap;
    }
}
