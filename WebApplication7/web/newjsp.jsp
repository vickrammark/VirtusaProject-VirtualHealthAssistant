
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%@ page import="java.sql.*" %>
        
        <%
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
            String uname="root";
            int rollno=4;
            String name="uma maheswari";
            String query="insert into studentdb values (?,?)";            String pass="pass123";
            Connection con=DriverManager.getConnection(url,uname,pass);
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, rollno);
            st.setString(2,name);
            int count = st.executeUpdate();
            out.println(count +" rows affected");
            st.close();
            con.close();
        %>
    </body>
</html>
