<%-- 
    Document   : demo
    Created on : May 27, 2020, 1:11:47 PM
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
        <h1>Hello World!</h1>
        <%
            Object s=request.getAttribute("res");
            String r=(String)s;
            out.println(r);
        %>
    </body>
</html>
