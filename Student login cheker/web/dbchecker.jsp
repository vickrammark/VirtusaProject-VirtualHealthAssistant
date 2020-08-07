<%-- 
    Document   : dbchecker
    Created on : May 16, 2020, 8:43:53 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="java.sql.*" %> 
        <%
            String uname=request.getParameter("uname");
            String passwo=request.getParameter("pass");
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
            String name="root";
            String pass="pass123";
            String query="Select password from dbstudent where name='" + uname+"'";
            Connection con=DriverManager.getConnection(url,name,pass);
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery(query);
            res.next();
            String ans=res.getString("password");
          //  out.println(ans);
        %>
        <% if(passwo.equals(ans)==true)
            {
                RequestDispatcher rd=request.getRequestDispatcher("/sucess");
                rd.forward(request,response);
            }
            else
            {
                 RequestDispatcher rd=request.getRequestDispatcher("/index.html");    
                                 rd.forward(request,response);

            }
            
       %>
    </body>
</html>
