/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailSending;

import com.sun.tools.xjc.api.S2JJAXBModel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.mail.Session;
import  javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author DELL
 */
@Stateless
public class MailSenderBean {
  
     public void sendEmail(String fromEmail,String username,String password,String toEmail,String subject,String message) throws MessagingException          
     {
         try {
             Properties props=System.getProperties();
             props.put("mail.smtp.host","smtp.gmail.com");
             props.put("mail.smtp.auth","true");
             props.put("mail.smtp.port","587");
             props.put("mail.smtp.starttls.enable", "true");
             props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
             props.put("mail.smtp.socketFactory.port","587");
             props.put("mail.smtp.socketFactory.fallback","false");
             
             Session mailSession=Session.getInstance(props,new javax.mail.Authenticator() {
                  @Override
                  protected PasswordAuthentication getPasswordAuthentication()
                  { 
                      return new PasswordAuthentication(fromEmail, password);
                  }
             }); 
             mailSession.setDebug(true);
             Message mailMessage=new MimeMessage(mailSession);
             mailMessage.setFrom(new InternetAddress(fromEmail));
             mailMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
             mailMessage.setSubject(subject);
             Multipart emailContent=new MimeMultipart();
             MimeBodyPart link=new MimeBodyPart();
             link.setText("http://localhost:32571/Virtual-Health-Asisstant");
             emailContent.addBodyPart(link);
             mailMessage.setContent(emailContent);
             Transport.send(mailMessage);
         } catch (Exception ex) {
                System.out.println(ex.getMessage());
         }
     }
     public static  void main(String args[]) throws MessagingException
     {
         MailSenderBean mail=new MailSenderBean();
         mail.sendEmail("bunnydummy65@gmail.com","Dummy Bunny","lbqqyfkiivhpejnn","vickrammark54@gmail.com", "hi","Heloooo");
     }

}

