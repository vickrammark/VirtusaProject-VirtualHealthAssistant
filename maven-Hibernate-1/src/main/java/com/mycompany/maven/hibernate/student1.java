/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.hibernate;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import test.test2;

/**
 *
 * @author DELL
 */
@Entity
public class student1 implements Serializable {
    @Id
    private int rollNo;

    @Override
    public String toString() {
        return "student1{" + "rollNo=" + rollNo + ", Name=" + Name + ", password=" + password + '}';
    }
        private test2 Name;
    private String password;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

  
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public test2 getName() {
        return Name;
    }

    public void setName(test2 Name) {
        this.Name = Name;
    }
            
}
