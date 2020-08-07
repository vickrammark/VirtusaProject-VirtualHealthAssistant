/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.bookstore.entity.users;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DELL
 */
public class usersTest {
    
    public static void main(String args[])
    {   users user1=new users();
        user1.setEmail("vickram@gmail.com");
        user1.setFullName("vickram");
        user1.setPassword("pass123");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.mycompany_Bookstore_war_1.0-SNAPSHOTPU");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user1);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("A Users object was persisted");
    }
}
