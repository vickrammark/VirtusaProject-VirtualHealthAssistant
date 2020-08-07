
<%@page import="daobjects.DBProcess"%>
<%@page import="daobjects.DBConnect"%>


<jsp:useBean id="obj_formdetails" class="vaobjects.FormDetails" scope="request"/>

<%
        DBProcess dbprocess=new DBProcess();

        try
        {
           int eid=obj_formdetails.getEid();
           String fname=obj_formdetails.getFname();
           String lname=obj_formdetails.getLname();
           String gender=obj_formdetails.getGender();
           String dob=obj_formdetails.getDob();
           String passwrd=obj_formdetails.getPasswrd();
           String email=obj_formdetails.getEmail();
           double mobile=obj_formdetails.getMobile();
           String city=obj_formdetails.getCity();
           String state=obj_formdetails.getState();

           String result=dbprocess.saveEmpDetails(eid, fname, lname, gender, dob,passwrd,email, mobile, city, state);

           if(result.equals("success"))
            {
               out.println("<h1>Registration Completed Successfully</h1>");
               out.println("<a href='Register.jsp'>Back</a>");
            }
            else
            {
               out.println(" Registration Failed     :"+result);
               out.println("<a href='Register.jsp'>Back</a>");
            }
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
%>