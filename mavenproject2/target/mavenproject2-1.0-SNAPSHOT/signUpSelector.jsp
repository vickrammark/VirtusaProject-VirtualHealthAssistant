<%-- 
    Document   : signUpSelector
    Created on : Jul 18, 2020, 10:23:53 AM
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
  <link rel="stylesheet" href="styles/signUp.css"> 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </head>
    <body>
          <nav class="navbar navbar-expand-sm" style="background-color:blueviolet">
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
        <div class="mainContainer container-fluid" >
            <div class="conatiner contentContainer col-lg-6 col-sm-6">
                <h2>Please Signup According To You Role</h2>
                    <div class="patient"><a href="#cardContainer">Patient</a></div>            
                    <div class="doctor"><a href="#cardContainer">Doctor</a></div>
                    <div class="lab"><a href="#cardContainer">Lab Technician</a></div>
            </div>
            <div id="cardContainer" class="conatiner contentContainer1 col-lg-4 col-sm-6">
               <div class=" card ">
                <img class="card-img-top" src="" style="width:100%;height:200px">   
                <div class="card-body">
                    <h5 class="card-header"></h5>
                    <p class="card-text">
                   
                    </p>
                </div>
                <a href="" class="btn btn-primary">SignUp<span style='font-size:15px; margin-left:6px '>&#10097;</span></a>
                </div>
            </div>
        </div>
      
    <script>
        $(document).ready(function(){
            $(".contentContainer div").on("click",function(next){
                var className=$(this).attr("class");
                if(className.includes("patient"))
                {
                className="patient";  
                }
               $(this).addClass('animator').delay(3200).queue(function(next) {
               $(this).removeClass('animator');
               next();
               });
    
                $(".contentContainer1").css("display","none");  
                if(className==="doctor")
                {
                    $(".contentContainer1").slideDown(2700).css("display","block");
                    $(".card-img-top").attr("src","images/doctor.jpg");
                    $(".card-header").html("Doctor");
                    $(".card-text").html("Click below to signup");
                    $(".btn").attr("href","doctorRegistration.jsp");
                }
                if(className==="patient")
                {
                    $(".contentContainer1").slideDown(2700).css("display","block");
                    $(".card-img-top").attr("src","images/patient.jpg");
                    $(".card-header").html("Patient");
                    $(".card-text").html("Click below to signup");
                    $(".btn").attr("href","patientRegistration.jsp");
                }
                 if(className==="lab")
                {
                    $(".contentContainer1").slideDown(2700).css("display","block");
                    $(".card-img-top").attr("src","images/lab.jpg");
                    $(".card-header").html("Lab Technician");
                    $(".card-text").html("Click below to signup");
                    $(".btn").attr("href","labRegistration.jsp");                    
                }
            });
        });
    </script>        
    </body>
</html>
