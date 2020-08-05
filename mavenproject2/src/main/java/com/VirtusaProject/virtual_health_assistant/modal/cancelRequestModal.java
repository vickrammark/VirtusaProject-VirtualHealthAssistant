/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.modal;

import com.VirutsaProject.virtual_health_assistant.Setter.cancelRequestSetter;

/**
 *
 * @author DELL
 */
public class cancelRequestModal {
    public cancelRequestSetter setCancelRequest(String id)
    {
        cancelRequestSetter cr=new cancelRequestSetter();
        cr.setId(id);
        return cr;
    }
}
