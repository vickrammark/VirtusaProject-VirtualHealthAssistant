/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Controller;

import javax.persistence.OneToOne;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import test.laptop;
import test.student;

/**
 *
 * @author DELL
 */
public class Controller1 {
 
    public static void main(String args[])
    {
        student s=new student();
        laptop l=new laptop();
        l.setLapId(101);
        l.setLapName("HP");
        laptop l1=new laptop();
        l1.setLapId(102);
        l1.setLapName("DELL");        
        laptop l2=new laptop();
        l2.setLapId(103);
        l2.setLapName("ASUS"); 
        s.setName("Vickram");
        s.setPassword("Pass1234");
        s.setRollNo(1);
        s.getLap().add(l);
        s.getLap().add(l1);
        s.getLap().add(l2);
        l.setStudent1(s);
        l1.setStudent1(s);
        l2.setStudent1(s);
        Configuration con=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(laptop.class);
        StandardServiceRegistryBuilder srb=new StandardServiceRegistryBuilder();
        srb.applySettings(con.getProperties());
        ServiceRegistry sr=srb.build();
        SessionFactory sf=con.buildSessionFactory(sr);
        Session session=sf.openSession();
        session.save(l);
        session.save(l1);
        session.save(l2);
        session.save(s);
        session.beginTransaction().commit();
        Transaction tx=session.beginTransaction();
        String p=s.getName();
        System.out.println(p);
        tx.commit();
    }

}
