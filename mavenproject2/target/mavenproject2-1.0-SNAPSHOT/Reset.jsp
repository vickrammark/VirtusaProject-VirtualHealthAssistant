<%-- 
    Document   : Reset
    Created on : Jul 15, 2020, 9:20:29 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="styles/Reset.css">
    </head>
    <body class="bg-warning">
        <div class="container-fluid" style="text-align:center;margin:20px auto;"><span class="header bg-success" style="font-size:20px">Reset Your Password</span></div>
        <div class="container"><div class="alert alert-danger alert-dismissible">Password does not match!!<button class="close" data-dismiss="alert">&times;</button></div></div>
        <div>
            <div class="container firstContainer mt-5">
            <form class="form-group mt-3" method="post" action="resetServlet" onsubmit="return checkPassword()">
                <label for="newPassword" style="font-size:20px">New Password</label>
                <input name="NewPassword" class="form-control mb-3" id="newPassword" placeholder="New Password" type="password" style="font-size:20px" required/>
                <label for="confirmPassword" style="font-size:20px">Confirm Password</label>
                <input name="ConfirmPassword" class="form-control mb-3" id="confirmPassword" placeholder="Confirm Password" type="password" style="font-size:20px" required>
                <input type="submit" id="submit" value="submit" class="btn btn-success" style="font-size:20px">
            </form>
            </div>
        </div>
        <script>
           var oldPass="";
           var newPass="";
           $("#confirmPassword").on("blur",function(){
             newPass=$("#newPassword").val();
             oldPass=$("#confirmPassword").val();   
           });  
                function checkPassword()
                {
                    if(newPass==oldPass)
                    {
                        return true;
                    }
                    else
                    {
                        $(".alert").css("display","block");
                        return false;
                    }
                }
        </script>
    </body>
</html>
