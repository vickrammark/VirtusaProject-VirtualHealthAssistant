/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author DELL
 */
@Entity
public class laptop {

    public int getLapId() {
        return LapId;
    }

    public void setLapId(int LapId) {
        this.LapId = LapId;
    }

    public String getLapName() {
        return LapName;
    }

    public void setLapName(String LapName) {
        this.LapName = LapName;
    }
         @Id
         private int LapId;
         private String LapName;
         @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
         private student student1;

    public student getStudent1() {
        return student1;
    }

    public void setStudent1(student student1) {
        this.student1 = student1;
    }
         
   
}
