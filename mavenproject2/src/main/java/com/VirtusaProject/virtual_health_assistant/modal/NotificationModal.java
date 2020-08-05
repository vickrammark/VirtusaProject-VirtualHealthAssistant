/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.modal;

import com.VirutsaProject.virtual_health_assistant.Setter.NotificationSetter;
import javax.management.Notification;

/**
 *
 * @author DELL
 */
public class NotificationModal {
    public NotificationSetter setNotification(String email)
    {
        NotificationSetter ns=new NotificationSetter();
        ns.setEmail(email);
        return ns;
    }    
}
