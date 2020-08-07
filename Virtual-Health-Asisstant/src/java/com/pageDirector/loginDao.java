/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pageDirector;

public class loginDao {
    
    public LoginDetails setElement(String Name,String Email,String Password,String Role)
    {
        LoginDetails log=new LoginDetails();
        log.setEmail(Email);
        log.setName(Name);
        log.setPassword(Password);
        log.setRole(Role);
        return log;
    }
}
