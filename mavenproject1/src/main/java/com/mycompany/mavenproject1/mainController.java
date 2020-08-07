/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import test.emploee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author DELL
 */
public class mainController {
    public static void main(String args[])
    {        
    ApplicationContext ctx=new ClassPathXmlApplicationContext("/bean.xml");
    emploee e1=ctx.getBean("emploee1",emploee.class);
    System.out.println(e1);
    }
}
