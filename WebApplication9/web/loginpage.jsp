
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            response.setContentType("text/html;charset=UTF-8");
          response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
           
        if(session.getAttribute("name")==null)
        {
           RequestDispatcher rd=request.getRequestDispatcher("/index.html");
           rd.forward(request, response);
        }
            out.println("hello welcome "+request.getAttribute("name") +" to login page");
        %>
        <a href="aboutus.jsp"> take me to abouts page</a>
    </body>
</html>
