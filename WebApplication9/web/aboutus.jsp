<%-- 
    Document   : aboutus
    Created on : May 18, 2020, 1:18:10 PM
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
         Hello your in about us page!!
        <%
          response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
           
        if(session.getAttribute("name")==null)
        {
           RequestDispatcher rd=request.getRequestDispatcher("/index.html");
           rd.forward(request, response);
        }
        %>
        <form action="logout" method="post">
            <input type="submit" value="logout">
        </form>
    </body>
</html>
