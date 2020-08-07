/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *
 * @author DELL
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class student  {
    @Id
    private int rollNo;
    private String Name;
    private String password;
    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER,mappedBy ="student1" )
    private List<laptop> lap=new ArrayList<laptop>();

    @Override
    public String toString() {
        return "student{" + "rollNo=" + rollNo + ", Name=" + Name + ", password=" + password + ", lap=" + lap + '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<laptop> getLap() {
        return lap;
    }

    public void setLap(List<laptop> lap) {
        this.lap = lap;
    }
    
}
