/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirtusaProject.virtual_health_assistant.modal.patientDetailsModal;
import com.VirtusaProject.virtual_health_assitant.dao.checkUser;
import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirtusaProject.virtual_health_assitant.dao.patientDetailsDao;
import com.VirutsaProject.virtual_health_assistant.Setter.patientDataHelperSetter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Request;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author DELL
 */
@WebServlet(name = "intermediatorChecker", urlPatterns = {"/intermediatorChecker"})
public class intermediatorChecker extends HttpServlet {
        String Fname=null;
        String Lname=null;
        String birthdate=null;
        String occupation=null;
        String role=null;
        String sex=null;
        String email=null;
        String password=null;
        String phonenumber=null;
        
        String address=null;
        String place_name=null;
        
        int age=0;
        int height=0;
        int weight=0;
        String blood_group=null;
        
        String bloodtype=null;
        String body_marks=null;
        
        String photo=null;
        InputStream input=null;
  
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        checkUser ch=new checkUser();
        boolean ismultipart=ServletFileUpload.isMultipartContent(req);
        if(ismultipart)
        { 
          DiskFileItemFactory factory=new DiskFileItemFactory();
          File file=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject2\\src\\main\\webapp\\temp\\");
          factory.setRepository(file);
          ServletFileUpload upload=new ServletFileUpload(factory);
          
          try
          {
              List<FileItem> item=upload.parseRequest(req);
             for(FileItem items:item)
                {
                    if(items.isFormField())
                    {
                       String fieldName=items.getFieldName();
                       if(fieldName.equals("firstname"))
                       {
                           Fname=items.getString();
                       }
                       else if(fieldName.equals("lastname"))
                       {
                           Lname=items.getString();
                       }
                       else if(fieldName.equals("birthdate"))
                       {
                           birthdate=items.getString();
                       }
                       else if(fieldName.equals("occupation"))
                       {
                           occupation=items.getString();
                       }
                       else if(fieldName.equals("sex"))
                       {
                           sex=items.getString();
                       }
                       else if(fieldName.equals("email"))
                       {
                           email=items.getString();
                       }
                       else if(fieldName.equals("password"))
                       {
                           password=items.getString();
                       }
                       else if(fieldName.equals("phonenumber"))
                       {
                           phonenumber=items.getString();
                       }
                       else if(fieldName.equals("address"))
                       {
                           address=items.getString();
                       }
                       else if(fieldName.equals("place_name"))
                       {
                           place_name=items.getString();
                       }
                       else if(fieldName.equals("age"))
                       {
                           age=Integer.parseInt(items.getString());
                       }
                       else if(fieldName.equals("height"))
                       {
                           height=Integer.parseInt(items.getString());
                       }
                       else if(fieldName.equals("weight"))
                       {
                           weight=Integer.parseInt(items.getString());
                       }
                       else if(fieldName.equals("blood_group"))
                       {
                           blood_group=items.getString();
                       }
                       else if(fieldName.equals("bloodtype"))
                       {
                           bloodtype=items.getString();
                       }
                       else if(fieldName.equals("body_marks"))
                       {
                           body_marks=items.getString();
                       }
                       else if(fieldName.equals("role"))
                       {
                           role=items.getString();
                       }
                    }
                    else 
                    {
                        input=items.getInputStream();
                    }
                }
              
          
              boolean ans=false;
              boolean success=false;
               String result1;
              patientDataHelperSetter pd=new patientDataHelperSetter();
              patientDetailsModal pm=pd.setPatientDetails(Fname, place_name, birthdate, occupation, sex, email, password, phonenumber, address, place_name, age, height, weight, blood_group, body_marks, input);
              String result="";
              HttpSession session=req.getSession();
            try {
                ans = ch.checkUser(Fname, email, password, role, out);
            } catch (Exception ex) {
                out.println(ex.getMessage());
            }
              out.println(ans+",Name="+Fname+",Email="+email+",Password="+password+",Role="+role+",sex="+sex);
              if(!ans)
              {
                  patientDetailsDao da=new patientDetailsDao();
                 result1=da.setPateintDetails(pm);
                  out.println(result1);
                if(result1.equals("true"))
                {
                    session.setAttribute("message","true");
                    session.setAttribute("name",Fname);
                   resp.sendRedirect("LoginPager.jsp");
                }
                else
                {
                    session.setAttribute("message","false");
                    session.setAttribute("name",Fname);
                    resp.sendRedirect("LoginPager.jsp");
                }
              }
              else
              {
                  out.println("hello"+ans);
                 session.setAttribute("message","false");
                resp.sendRedirect("/patientRegistration.jsp");
              }
          }
          catch(Exception ex)
          {
              out.println(ex.getMessage());
          }
          
        }
        
    }    
}
