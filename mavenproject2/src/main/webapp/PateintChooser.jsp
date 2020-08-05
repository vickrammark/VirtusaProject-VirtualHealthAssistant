<%-- 
    Document   : demo
    Created on : Jul 20, 2020, 9:34:06 PM
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
  <link rel="stylesheet" href="styles/pateintChooser.css"> 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm" style="background-color:#FB053C ">
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
            <div class="row m-0">
                <div class="patientDetailContainer col-lg-6 col-sm-6 col-xs-12 p-0">
                    <h3 class="header">See your reports and details</h3>
                    <div class="conatiner1">
                        <img src="images/details_logo.png" style="width:150px;height:150px">
                        <a href="patientUi.jsp" class="btn btn-success">click here <span style='font-size:15px; margin-left:6px'>&#10097;</span></a>
                    </div>
                </div>
                <div class="bookingContainer col-lg-6 col-sm-6 col-xs-12 p-0" >
                    <h3 class="header">Book your Doctors</h3>
                    <div class="conatiner2">
                        <img src="images/bookingDetails.png" style="width:150px;height:150px">
                        <a href="patientBookingUI.jsp" class="btn btn-success">Click here <span style='font-size:15px; margin-left:6px'>&#10097;</span></a>
                    </div>                    
                </div>
            </div>

        <script>
            var email="<%=(String)request.getAttribute("message")%>";
            localStorage.setItem("email",email);
        </script>
    </body>
</html>
