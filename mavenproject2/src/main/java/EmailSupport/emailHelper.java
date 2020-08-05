/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailSupport;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.ejb.Stateless;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
@Stateless
public class emailHelper {
    public static String sendMail(String toEmail) throws AddressException, MessagingException
    {
        Properties prop=new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.auth","true");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.starttls.enable","true");
        Session session=Session.getInstance(prop,new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication(){
         return new PasswordAuthentication("bunnydummy65@gmail.com","akommtffvsevsmkt");
          }
        });
        
        MimeMessage message=new MimeMessage(session);
        message.setFrom(new InternetAddress("bunnydummy65@gmail.com"));  
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
        BodyPart body=new MimeBodyPart();
        body.setText("please click the link to reset your password \n"+"http://localhost:32571/mavenproject2/Reset.jsp");
        Multipart multipart=new MimeMultipart();
        multipart.addBodyPart(body);
        message.setContent(multipart);
        message.setSubject("Reset Link");
        Transport.send(message);
        return "success";
    }
    
}
