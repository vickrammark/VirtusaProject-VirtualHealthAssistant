<%-- 
    Document   : productprest
    Created on : May 21, 2020, 2:41:20 PM
    Author     : DELL
--%>

<%@page import="test.DoaClass"%>
<%@page import="test.validationClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <form method="post" name="f1" onsubmit="return test()">
            Username : <input type="text" name="uname" value=""/>    <br/>
            Password : <input type="password" name="pass"/><br/>
            <input type="submit" value="SUBMIT"/>
        </form>
    
        <%!
            DoaClass d=new DoaClass();
         %>
         <%
                  validationClass y=(validationClass)request.getAttribute("details");
            int price=d.pricedtails(y,response);
            out.println("price="+price);
 
         %>
      <script type="text/javascript">

            function test(){

                var t1 = document.forms[0].uname.value;
                var t2 = document.forms[0].pass.value;

                if(t1==""){
                    alert("Enter the Username");
                    f1.uname.focus();
                    return false;
                }

                if(t2==""){
                    alert("Enter the Password");
                    f1.pass.focus();
                    return false;
                }

                return true;

            }

            
        </script>
       
    </body>
</html>
