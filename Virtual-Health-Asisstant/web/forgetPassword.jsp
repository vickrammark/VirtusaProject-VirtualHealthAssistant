<%-- 
    Document   : forgetPassword
    Created on : Jul 11, 2020, 4:51:48 PM
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
        <h1>Contact us !!</h1>
        <form method="POST" action="NewServlet">
            <table>
            <tr>
                <td align="right">To:</td>
                <td>
                    <input type="text" name="email" size="75"/>
                </td>
            </tr>    
            <tr>  
                <td align="right">Subject:</td>
                <td>
                    <input type="text" name="subject" size="75"/>
                </td>
            </tr>    
                <td align="right">Message:</td>
                <td>
                    <textarea name="message" cols="75" rows="6"></textarea>
                </td>
            <tr>    
                <td>
                    <input type="submit" value="send"/>
                </td>
             </tr>
        </table>
    </form>
    </body>
</html>
