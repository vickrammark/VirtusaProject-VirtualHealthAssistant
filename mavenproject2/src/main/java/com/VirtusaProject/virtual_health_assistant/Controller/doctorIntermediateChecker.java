package com.VirtusaProject.virtual_health_assistant.Controller;

import com.VirutsaProject.virtual_health_assistant.Setter.doctorDeatilsSetter;
import com.VirtusaProject.virtual_health_assitant.dao.checkUser;
import com.VirtusaProject.virtual_health_assistant.util.dataBaseConnection;
import com.VirtusaProject.virtual_health_assitant.dao.doctorDetailsDao;
import com.VirtusaProject.virtual_health_assistant.modal.doctorDetailsModal;
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
@WebServlet(name = "doctorIntermediateChecker", urlPatterns = {"/doctorIntermediateChecker"})
public class doctorIntermediateChecker extends HttpServlet {
        String Fname=null;
        String Lname=null;
        String birthdate=null;
        String role=null;
        String sex=null;
        String email=null;
        String password=null;
        String phonenumber=null;        
        String address=null;
        String place_name=null;        
        String specialization=null;        
        String qualification=null;
        int experience;   
        String Hospital=null;
        InputStream input=null;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        checkUser ch=new checkUser();
        boolean ismultipart=ServletFileUpload.isMultipartContent(req);
                      String result="";
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
                       else if(fieldName.equals("role"))
                       {
                           role=items.getString().toLowerCase();
                       }
                       else if(fieldName.equals("specialization"))
                       {
                           specialization=items.getString();
                       }
                       else if(fieldName.equals("qualification"))
                       {
                           qualification=items.getString();
                       }
                       else if(fieldName.equals("experience"))
                       {
                           experience=Integer.parseInt(items.getString());
                       }
                       else if(fieldName.equals("Hospital"))
                       {
                           Hospital=items.getString();
                       }
                    }
                    else 
                    {
                        input=items.getInputStream();
                    }
                }
              
          
              boolean ans=false;
              boolean success=false;
              doctorDeatilsSetter ds=new doctorDeatilsSetter();
              HttpSession session=req.getSession();
              doctorDetailsModal dml=ds.setDoctorDetails(Fname, place_name, birthdate, address, place_name, email, password, phonenumber, sex, specialization, Hospital, qualification,experience, input);
            try {
                ans = ch.checkUser(Fname, email, password, role, out);
            } catch (Exception ex) {
                out.println(ex.getMessage()+"Hello");
            }
              out.println(ans+",Name="+Fname+",Email="+email+",Password="+password+",Role="+role+",exp="+experience);
              if(!ans)
              {
                  
                  doctorDetailsDao dao=new doctorDetailsDao();
                  result=dao.setDoctorDeatils(dml);
                  out.println("res="+result);
                  if(result.equals("true"))
                  {
                      session.setAttribute("message", "true");
                      session.setAttribute("name", Fname);
                      resp.sendRedirect("LoginPager.jsp");
                  }
                  else
                  {
                      session.setAttribute("message", "false");
                      session.setAttribute("name", Fname);
                      resp.sendRedirect("LoginPager.jsp");  
                    out.println("res="+result);
                  }
    
              }
              else
              {
                 session.setAttribute("message","false");
                 resp.sendRedirect("/doctorRegistration.jsp");
              }
          }
          catch(Exception ex)
          {
              out.println(ex.getMessage()+"Hello1"+Hospital+Fname+"res="+result);
          }
          
        }
        
    }    
}
