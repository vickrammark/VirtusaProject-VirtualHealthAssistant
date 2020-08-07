<%-- 
    Document   : signinSuccess
    Created on : May 31, 2020, 1:04:13 PM
    Author     : DELL
--%>

<%@page import="SigninModule.signinCheck"%>
<%@page import="SigninModule.doaclass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Signin Successfull!</h1>
        <%
            doaclass d=new doaclass();
            signinCheck s=(signinCheck)request.getAttribute("details");
            d.insert(s);
        %>
    </body>
</html>
