package com.VirutsaProject.virtual_health_assistant.Setter;

import com.VirtusaProject.virtual_health_assistant.modal.LoginDetailsModal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class loginDetailsSetter {
    
    public LoginDetailsModal setElement(String Name,String Email,String Password,String Role)
    {
        LoginDetailsModal log=new LoginDetailsModal();
        log.setEmail(Email);
        log.setName(Name);
        log.setPassword(Password);
        log.setRole(Role);
        return log;
    }
}
