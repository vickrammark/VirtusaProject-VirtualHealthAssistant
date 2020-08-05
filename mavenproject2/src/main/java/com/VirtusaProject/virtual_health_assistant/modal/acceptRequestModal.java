/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.modal;

import com.VirutsaProject.virtual_health_assistant.Setter.acceptRequestSetter;

/**
 *
 * @author DELL
 */
public class acceptRequestModal {
    public acceptRequestSetter setDetail( String id,String appDate,String appTime)
    {
        acceptRequestSetter as=new acceptRequestSetter();
        as.setAppDate(appDate);
        as.setAppTime(appTime);
        as.setId(id);
        return as;
    }
}
