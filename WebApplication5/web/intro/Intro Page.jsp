<%-- 
    Document   : Intro Page.jsp
    Created on : May 27, 2020, 12:39:21 PM
    Author     : DELL
--%>

<%@page import="validation.DoaClass"%>
<%@page import="validation.NewClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Success!!</h1>
        <%!
            DoaClass d=new DoaClass();
        %>
        <%
            NewClass l=(NewClass)request.getAttribute("Details");
            out.println("ok");
        %>
    </body>
</html>
