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
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="styles/forget.css">
    </head>
    <body>
        <nav class="navbar navbar-expand-sm">
               <ul class="navbar-nav">
                   <li class="nav-item">
                       <a class="nav-link" href="index.jsp" style="color:white;font-size:20px;font-weight:bold">Home</a>
                   </li>
                   <li class="nav-item">
                       <a class="nav-link" href="#" style="color: white;font-size:20px;font-weight:bold">About Us</a>
                   </li>
                   <li class="nav-item">
                       <a class="nav-link" href="#" style="color: white;font-size:20px;font-weight:bold">Contact Us</a>
                   </li>
               </ul>
            <div class="fromLeft">
                   <div class="nav-item">
                       <a class="nav-link" href="Login.jsp" style="color: white;font-size:20px;font-weight:bold">Login</a>
                   </div>                   
                   <div class="nav-item">
                       <a class="nav-link" href="signUpSelector.jsp" style="color: white;font-size:20px;font-weight:bold">SignUp</a>
                   </div>
                </div>
        </nav>
            <div class="container-fluid header"><h2>Instruction</h2></div>
         <div class="list">
        <ul class="Instruction">
            <li>Please provide your registered email</li>   
            <li>We will send a reset link you can change the password by clicking the link</li>   
        </ul>
        </div>
            <div class="container"><div class="alert alert-dismissible"><span class="close" data-dismiss="alert">&times;</span></div></div>
        <div class="container secondContainer ">
            <form method="POST" action="emailSenderServlet">
            <label for="Email" class="emailLabel">Please enter your email address</label>
            <input class="form-control mb-3" type="email"  name="Email" id="Email" placeholder="email" required style="font-size:20px">
            <input type="submit" value="submit" class="btn btn-success"/>
            </form>
        </div>
            <script>
                $(document).ready(function(){
                   
                    var message=<%=(String)request.getAttribute("message")%>
                    window.console.log(message); 
                    alert(message);
                    if(message==true)
                    {
                        $(".alert").addClass("alert-success");
                        $(".alert").html("Reset link sent successfully!!"+"<span class='close' data-dismiss='alert'>&times;</span>");
                        $(".alert").css("display","block");
                    }
                    else if(message==f)
                    {
                        $(".alert").addClass("alert-danger");
                        $(".alert").html("Sorry link cannot be sent to the provided mail!!");
                        $(".alert").css("display","block");
                    }
                });
            </script>
    </body>
</html>
