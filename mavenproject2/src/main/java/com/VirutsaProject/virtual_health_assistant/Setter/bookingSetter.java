/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirutsaProject.virtual_health_assistant.Setter;

import com.VirtusaProject.virtual_health_assistant.modal.bookingModal;

/**
 *
 * @author DELL
 */
public class bookingSetter {
 
    public bookingModal setBooking(String did,String email,String reason)
    {
        bookingModal bk=new bookingModal();
        bk.setDid(did);
        bk.setEmail(email);
        bk.setReason(reason);
        return bk;
    }
}
