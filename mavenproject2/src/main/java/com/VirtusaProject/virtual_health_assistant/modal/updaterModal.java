/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.modal;

import com.VirutsaProject.virtual_health_assistant.Setter.updaterSetter;

/**
 *
 * @author DELL
 */
public class updaterModal {
    
  public updaterSetter setPresscribeId(String presId,String AppDate,String AppTime,String AppConfirmation)
  {
      updaterSetter ud=new updaterSetter();
      ud.setPresId(presId);
      ud.setAppDate(AppDate);
      ud.setAppTime(AppTime);
      ud.setAppConfirmation(AppConfirmation);
      return ud;
  }   
}
