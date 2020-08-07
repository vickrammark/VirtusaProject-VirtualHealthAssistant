<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/patientUi.css"> 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </head>
 <%
              
                String email=(String)session.getAttribute("message");
                if(email.equals(""))
                {
                    response.sendRedirect("Login.jsp");
                }
            %>
    <body>
        <div class="nav">
              <nav class="navbar navbar-expand-sm mt-0" style="background-color:blueviolet">
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
                       <a class="nav-link" href="Login.jsp" style="color: white;font-size:20px;font-weight:bold">LogOut</a>
                   </div>                   
                </div>
          </nav>
        </div>    
        <div class="row row1">
            <div class="menu col-lg-3 col-sm-3 col-xs-2">
                <span class="menuOpener"><img class="imgMenu" src="images/menuLogo.png" style="width:20px;height:20px"/>Menu</span>
            </div>
            <div class="menuHeader col-lg-8 col-sm-8 col-xs-10">
                <h1 class="menuHeaderContent">Patient Platform</h1>
            </div>
          </div>   
            <div class="menuList ">
                <div class="profileImage">
                    <img class="imgProfile" name="temp" src="pateintimageRetriver" alt="No image available" style=" width:120px;height:120px"/>
                    <p class="userName"></p>
                </div>
                <div class="Home menuitems">
                    <a class="HomeLink" href="#">Home<span style='font-size:15px;margin-left:6px'>&#10087;</span></a>
                </div>
                <div class="menuStack">
                <div class="profile menuitems">
                    <a href="#" class="profileLink">Profile<span style='font-size:15px;margin-left:6px'>&#10087;</span></a>
                </div>
                <div class="doctor menuitems">
                    <a href="#" class="doctorLink">Your Doctors<span style='font-size:15px;margin-left:6px'>&#10087;</span></a>
                </div>
                <div class="result menuitems">
                    <a href="#" class="resultLink">Lab Results<span style='font-size:15px;margin-left:6px'>&#10087;</span></a>
                </div>
                <div class="appointment menuitems">
                    <a href="#" class="appointmentLink">Appointment<span class="notifiactions badge badge-pill badge-primary"></span><span style='font-size:15px;margin-left:6px'>&#10087;</span></a>
                </div>
                </div>
            </div>
            <div class="mainContent m-0 p-0" style="height:550px;">
                <div class="cardDecker" style="height:100%">
                    <div class=" card" >
                        <img class="card-img-top" src="images/specialization.jpg" style="width:100%;height:200px">   
                    <div class="card-body">
                        <h5 class="card-header">Book Doctor</h5>
                        <p class="card-text">
                            Please click here to have an appointment;
                        </p>
                    </div>
                        <button class="btn btn-primary" id="booking">Book Now!!<span style='font-size:15px;'>&#10087;</span></button>
                   </div>
      
                    <div class=" card " >
                        <img class="card-img-top" src="images/specialization.jpg" style="width:100%;height:200px">   
                    <div class="card-body">
                        <h5 class="card-header">Know More About Specialization</h5>
                        <p class="card-text">
                            To know more about the specialization we provide click below
                        </p>
                    </div>
                    <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10087;</span></button>
                    </div>
                    <div class="card " >
                        <img class="card-img-top" src="images/specialization.jpg" style="width:100%;height:200px">   
                    <div class="card-body">
                        <h5 class="card-header">Diet tables</h5>
                        <p class="card-text">
                            Click here to know about the diet tables and choose your own.
                        </p>
                    </div>
                    <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10087;</span></button>
                   </div>
                                                          
                    <div class=" card ">
                        <img class="card-img-top" src="images/specialization.jpg" style="width:100%;height:200px">   
                    <div class="card-body">
                        <h5 class="card-header">Donate us</h5>
                        <p class="card-text">
                            Click here to give us funds to rise orphan childrens
                        </p>
                    </div>
                    <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10087;</span></button>
                   </div>
                   <div class="card ">
                        <img class="card-img-top" src="images/specialization.jpg" style="width:100%;height:200px">   
                    <div class="card-body">
                        <h5 class="card-header">Customer Support</h5>
                        <p class="card-text">
                            Click here to get our service.
                        </p>
                    </div>
                    <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10087;</span></button>
                   </div>
                    <div class="card" >
                        <img class="card-img-top" src="images/specialization.jpg" style="width:100%;height:200px">   
                    <div class="card-body">
                        <h5 class="card-header">Your Body Statistics</h5>
                        <p class="card-text">
                             To know about your body and  your health statistics click here 
                        </p>
                    </div>
                    <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10087;</span></button>
                   </div>
                </div>
                <div class="profileContainer" style="height:100%">
            <form   method="POST"  class="formMain" action="Updater" enctype="multipart/form-data">
                  <div class="row"> 
                   <div class="sideContainer1 col-lg-4 col-sm-6">
                       <div class="form-group">
                           <div class="alert alert-fname alert-dismissible alert-danger">Name cannot contain special character and numbers!!</div>  
                           <label for="firstname">First Name:</label>
                           <input class="form-control pFName" type="text" id="firstname" name="firstname" placeholder="First Name"  maxlength="16">
                       </div>
                       <div class="form-group">
                           <div class="alert alert-lname alert-dismissible alert-danger">Name cannot contain special character and numbers!!</div>       
                           <label for="lastname">Last Name:</label>
                           <input class="form-control pLName" type="text" id="lastname" name="lastname" placeholder="Last Name"  maxlength="16">
                       </div>
                       <div class="form-group">
                           <label for="birthdate">Birth Date:</label>
                           <input class="form-control pBirthdate" type="text"  placeholder="mm/dd/yyyy" id="birthdate" name="birthdate"   >
                       </div>
                       <div class="form-group">
                          <div class="alert alert-Oname alert-dismissible alert-danger">Occupation cannot contain special character and numbers!!</div>     
                           <label for="occupation">Occupation:</label>
                           <input class="form-control pOccupation" type="text" id="occupation" name="occupation" placeholder="Occupation"  maxlength="16">
                       </div>
                       <div class="form-group">
                           <label for="sex">Sex:</label>
                           <input class="form-control pSex" id="sex" type="text" >
                       </div>        
                       <div class="form-group">
                           <div class="alert alert-Ename alert-dismissible alert-danger">Email format entered is wrong!!</div>         
                           <label for="email">Email:</label>
                           <input class="form-control pEmail" type="email" id="email" name="email" placeholder="Email"  maxlength="30">
                       </div>                       
                   </div>
                      <div class="update">
                          <span class="close" data-dismiss="update">&times;</span>
                          <div ><p class="updateContent"></p></div>
                      </div>
                   <div class="sideContainer2 col-lg-4 col-sm-6">
                       <div class="form-group">
                           <div class="alert  alert-Pname alert-dismissible alert-danger">Phone Number should contain only numbers and should be 10 digits</div>                          
                           <label for="phonenumber">Phone Number:</label>
                           <input class="form-control pPhoneNumber" type="text" name="phonenumber" id="phonenumber" placeholder="Phone Number"  maxlength="10">
                       </div>
                       <div class="form-group">
                           <label for="address">Address:</label>
                           <input class="form-control pAddress" type="text" name="address" id="address" placeholder="Address"  maxlength="30">
                       </div>
                       <div class="form-group">
                           <label for="place_name">Place Name:</label>
                           <input class="form-control pPlaceName" type="text" name="place_name" id="place_name" placeholder="Place Name"  maxlength="20">
                       </div>
                       <div class="form-group">
                           <label for="age">Age:</label>
                           <input class="form-control pAge" type="number" name="age" id="age" placeholder="Age">
                       </div>
                       <div class="form-group">
                           <label for="height">Height:</label>
                           <input class="form-control pHeight" type="number" name="height" id="height" placeholder="Height">
                       </div>
                       <div class="form-group">
                           <label for="weight">weight:</label>
                           <input class="form-control pWeight" type="number" name="weight" id="weight" placeholder="Weight">
                       </div>                           
                   </div>
                 <div class="sideContainer3 col-lg-4 col-sm-8">
                     <div class="form-group"> 
                               <label for="bloodtype">Blood Type:</label>
                               <input name="bloodtype" id="bloodtype"  class="form-control pBloodGroup">   
                     </div>
                     
                       <div class="form-group">
                           <label for="body_marks">Body Mark:</label>
                           <input name="body_marks" id="body_marks" class="form-control pBodyMark" type="text" maxlength="10" placeholder="Body Marks"/>
                       </div>
                     <div class="form-group">
                         <input id="login" class="btn btn-primary" type="button" value="Upadte"/>
                       </div>
                       </div>
                   </div>
               </form>
                </div>
                <div class="specializationContainer">
        <p style="font-size:20px;" class="mapper mainPageMapper"><span style="font-size:20px;margin-left:6px"><</span>Go Back</p>
                    <div class="specializationOption">
                        <h3>Please choose the specialization</h3>
                        <div class="con"> 
                        <div class="eyeContainer option" id="eye">
                            <div class="Img" >
                                <img src="images/eye.png" class="icon">
                            </div>
                            <p class="Opcontent">
                                Eye
                            </p>
                        </div>
                            <div class="diabetesContainer option" id="diabetes">
                            <div class="Img">
                                <img src="images/diabetesCare.png" class="icon">
                            </div>
                            <p class="Opcontent">
                               Diabetes
                            </p>
                        </div>
                       </div>  
                        <div class="con"> 
                            <div class="boneContainer option" id="bone">
                            <div class="Img" >
                                <img src="images/bone care.png" class="icon">
                            </div>
                            <p class="Opcontent">
                                Bone
                            </p>
                        </div>
                            <div class="childContainer option" id="child">
                            <div class="Img" >
                                <img src="images/chidCare.jpg" class="icon">
                            </div>
                            <p class="Opcontent">
                                Child
                            </p>
                        </div>
                        </div>
                       <div class="con"> 
                           <div class="hairContainer option" id="hair">
                            <div class="Img">
                                <img src="images/hairCare.jpg" class="icon">
                            </div>
                            <p class="Opcontent">
                                Hair
                            </p>
                        </div>
                           <div class="earContainer option" id="ear">
                            <div class="Img">
                                <img src="images/earCare.jpg" class="icon">
                            </div>
                            <p class="Opcontent">
                               Ear
                            </p>
                        </div>
                       </div>    
                       <div class="con">  
                           <div class="psychoContainer option" id="psychology">
                            <div class="Img" >
                                <img src="images/psychology.webp" class="icon">
                            </div>
                            <p class="Opcontent">
                               Psychological Care
                            </p>
                        </div>
                           <div class="physioConatiner option" id="physiology">
                            <div class="Img">
                                <img src="images/physiotherapy.png" class="icon">
                            </div>
                            <p class="Opcontent">
                                Physiotherapy
                            </p>
                        </div>
                        </div> 
                    </div>
                  </div>
                <div class="hospitalContainer">
                    <div class="hospitalBodyContainer"> 
        <p style="font-size:20px;" class="mapper specializationMapper"><span style="font-size:20px;margin-left:6px"><</span>Go Back</p>
                    <div class="searchCotainer">                           
                    <div class="form-group col-lg-4">
                        <label for="placeSearcher">Select your place:</label>
                        <select class="placeSearcher form-control" required>
                            <option value="dindugul">Dindugul</option>
                            <option value="coimbatore">Coimbatore</option>
                            <option value="madurai">Madurai</option>
                        </select>
                    </div>
                    </div> 
                   <div class="hospitalContent">
                     </div>   
                </div>
                    
            </div>
                <div class="doctorContainer">
        <p style="font-size:20px;" class="mapper doctorChoosingMapper"><span style="font-size:20px;margin-left:6px"><</span>Go Back</p>                    
                    <div class="doctorContent">
                                                                         
                    </div>
                </div>  
              <div class="appointmentContainer">
        <p style="font-size:20px;" class="mapper appointmentChoosingMapper"><span style="font-size:20px;margin-left:6px"><</span>Go Back</p>                    
                  <div class="appointmentContent">
                  </div>
              </div>
            <div class="myDoctorContainer">
                <div class="myDoctorContent">
                    <div class="row m-0"> 
                        <div class="assistContainer col-lg-3 col-sm-3  col-xs-10">
                            <div class="doctorsFixed">
                               <button class="chooser">Doctors</button>
                            </div>
                           <div class="Note">
                               <button class="chooser">Note for Doctors</button>
                            </div>
                            <div class="prescription">
                               <button class="chooser">Prescriptions</button>
                            </div>
                            <div class="LabRecords">
                               <button class="chooser">Your Records</button>
                           </div>
                        </div>
                        <div class="workingArea col-sm-9 col-lg-9 col-xs-10 pl-2 pr-2">
                            <div class="fixedDoctorDetails">
                            </div>
                            <div class="noteContainer">
                                
                            </div>
                        </div>
                    </div>     
                </div> 
          </div>
         </div>       
        <script>
                var email=localStorage.getItem("email");
            $(".logOut").on("click",function(){
                <%
                    session.setAttribute("message","");
                    session.invalidate();
                    response.sendRedirect("Login.jsp");
                %> 
             });

                var left=$(document).width()/2; 
                $(".update").css("left",left);
                $(".imgProfile").attr("src","./pateintimageRetriver?email="+email+"&role=patient"); 
            $(".menuOpener").on("click",function(){
                var left=$(".menuList").css("left");
                if(left<"0px")
                {    
                $(".menuList").animate({
                    left:"0%" 
                });
                }
                else
                {
                    $(".menuList").animate({
                        left:"-55%"
                    });
                }                
            });
                    
            $(".mainContent .cardDecker").on("click",function(){
                $(".menuList").animate({
                     left:"-55%"          
                });
            });
            $(".row1 .menuHeader").on("click",function(){
                $(".menuList").animate({
                     left:"-55%"          
                }); 
            });
            $.ajax({
               type:"POST",
               url:"upadter",
               data:{
                   email:email,
                   function:"name",
                   role:"patient"
               },
               success: function (data, textStatus, jqXHR) {
                        $(".userName").html(data);
                    }
            });
            $(".profileLink").on("click",function(){
            $.ajax({
               type:"POST",
               url:"upadter",
               data:{
                   email:email,
                   function:"profile",
                   role:"patient"
               },
               success: function (data, textStatus, jqXHR) {
                   $(".cardDecker").css("display","none");
                   var array=new Array();
                   array=data.split(",");
                   if(array[0]!=="")
                   {
                   $(".pFName").val(array[0]);     
                   }
                   else
                   {
                    $(".pFName").val("Not Provided");   
                   }
                   if(array[1]!=="")
                   {
                   $(".pLName").val(array[1]);     
                   }
                   else
                   {
                    $(".pLName").val("Not Provided");   
                   }
                   if(array[2]!=="")
                   {
                       var date=array[2];
                   $(".pBirthdate").val(date.slice(0,10));     
                   }
                   else
                   {
                     $(".pBirthdate").val("Not Provided");
                   }
                   if(array[3]!=="")
                   {
                   $(".pOccupation").val(array[3]);    
                   }
                   else
                   {
                     $(".pOccupation").val("Not Provided");
                   }
                   if(array[4]!=="")
                   {
                    $(".pSex").val(array[4]);   
                   }
                   else
                   {
                     $(".pSex").val("Not Provided");
                   }
                   if(array[5]!=="")
                   {
                       $(".pEmail").val(array[5]);
                   }
                   else
                   {
                     $(".pEmail").val("Not Provided");  
                   }
                   if(array[6]!=="")
                   {
                    $(".pPhoneNumber").val(array[6]);   
                   }
                   else
                   {
                     $(".pPhoneNumber").val("Not Provided");  
                   }
                   if(array[7]!=="")
                   {
                      $(".pAddress").val(array[7]); 
                   }
                   else
                   {
                     $(".pAddress").val("Not Provided");
                   }
                   if(array[8]!=="")
                   {
                      $(".pPlaceName").val(array[8]); 
                   }
                   else
                   {
                      $(".pPlaceName").val("Not Provided"); 
                   }
                   if(array[9]!=="")
                   {
                       $(".pAge").val(array[9]);  
                   }
                   else
                   {
                       $(".pAge").val("Not Provided");
                   }
                   if(array[10]!=="")
                   {
                       $(".pHeight").val(array[10]);
                   }
                   else
                   {
                       $(".pHeight").val("Not Provided");
                   }
                   if(array[11]!=="")
                   {
                      $(".pWeight").val(array[11]); 
                   }
                   else
                   {
                       $(".pWeight").val("Not Provided");
                   }
                   if(array[12]!=="")
                   {
                       $(".pBloodGroup").val(array[12]);
                   }
                   else
                   {
                       $(".pBloodGroup").val("Not Provided");
                   }
                   if(array[13]!=="")
                   {
                       $(".pBodyMark").val(array[13]);
                   }
                   else
                   {
                       $(".pBodyMark").val("Not Provided");
                   }
                  $(".profileContainer").css("display","block");
                  $(".menuHeaderContent").html("Your Profile");
                  $(".cardDecker").css("display","none");
                  $(".specializationContainer").css("display","none");
                  $(".placeSearcher").val("select");
                  $(".hospitalContent").html("");
                  $(".doctorContainer").css("display","none");
                  $(".appointmentContainer").css("display","none");       
                  $(".myDoctorContainer").css("display","none");
                  
            }
            });                
            });
            $(".HomeLink").on("click",function(){
               $(".cardDecker").css("display","flex");
               $(".profileContainer").css("display","none");
               $(".menuHeaderContent").html("Patient Platform");
               $(".specializationContainer").css("display","none");
               $(".hospitalContainer").css("display","none");
               $(".placeSearcher").val("select");
               $(".hospitalContent").html("");
               $(".doctorContainer").css("display","none");
               $(".appointmentContainer").css("display","none"); 
               $(".myDoctorContainer").css("display","none");
               
              });
             $(".appointmentChoosingMapper").on("click",function(){
                  $(".profileContainer").css("display","none");
                  $(".appointmentContainer").css("display","none");
                  $(".menuHeaderContent").html("Patient Platform");
                  $(".cardDecker").css("display","flex");
                  $(".specializationContainer").css("display","none");
                  $(".placeSearcher").val("select");
                  $(".hospitalContent").html("");
                  $(".doctorContainer").css("display","none");
                  $(".hospitalContainer").css("display","none");
                  $(".myDoctorContainer").css("display","none");
                  
             });
             $(".profileLink").on("click",function(){ 
               $(".cardDecker").css("display","flex");
               $(".profileContainer").css("display","block");
               $(".menuHeaderContent").html("Your Profile");
               $(".specializationContainer").css("display","none");
               $(".hospitalContainer").css("display","none");
               $(".placeSearcher").val("select");
               $(".hospitalContent").html("");
               $(".doctorContainer").css("display","none");
               $(".appointmentContainer").css("display","none");
               $(".myDoctorContainer").css("display","none");
               
              });
              
            $("#booking").on("click",function(){
               $(".cardDecker").css("display","none");
               $(".profileContainer").css("display","none");
               $(".specializationContainer").css("display","block");
               $(".menuHeaderContent").html("Doctor Booking");
               $(".hospitalContainer").css("display","none");
               $(".placeSearcher").val("select");         
               $(".hospitalContent").html("");
               $(".doctorContainer").css("display","none");
               $(".appointmentContainer").css("display","none"); 
               $(".myDoctorContainer").css("display","none");
               
           });
                    
               $(".specializationMapper").on("click",function(){
                  $(".profileContainer").css("display","none");
                  $(".menuHeaderContent").html("Your Specialization");
                  $(".cardDecker").css("display","none");
                  $(".specializationContainer").css("display","block");
                  $(".placeSearcher").val("select");
                  $(".hospitalContent").html("");
                  $(".doctorContainer").css("display","none");
                  $(".hospitalContainer").css("display","none");  
                  $(".appointmentContainer").css("display","none");
                  $(".myDoctorContainer").css("display","none");
                  
                });
                 $(".mainPageMapper").on("click",function(){
                  $(".cardDecker").css("display","flex");
                  $(".menuHeaderContent").html("Patient Paltform");
                  $(".specializationContainer").css("display","none");
                  $(".placeSearcher").val("select");
                  $(".hospitalContent").html("");
                  $(".hospitalContainer").css("display","none");
                  $(".doctorContainer").css("display","none");              
                 $(".appointmentContainer").css("display","none"); 
                 $(".myDoctorContainer").css("display","none");
                         
             });    
               $(".doctorChoosingMapper").on("click",function(){
                  $(".cardDecker").css("display","none");
                  $(".menuHeaderContent").html("Hospitals Around You");
                  $(".specializationContainer").css("display","block");
                  $(".placeSearcher").val("select");
                  $(".hospitalContent").html("");
                  $(".hospitalContainer").css("display","none");
                  $(".doctorContainer").css("display","none");                  
                  $(".appointmentContainer").css("display","none");
                  $(".myDoctorContainer").css("display","none");
                  
              });
               var specializationName="";
             $(".option").on("click",function(){
                 var specializationClass=$(this).attr("id");
                 specializationName=specializationClass;     
               $(".hospitalContainer").css("display","block");
               $(".cardDecker").css("display","none");
               $(".profileContainer").css("display","none");
               $(".specializationContainer").css("display","none");
               $(".menuHeaderContent").html("Hospitals Around You");
               $(".doctorContainer").css("display","none");
               $(".hospitalContent").html("please select the cities to know the hospital and book you doctors!!!");});
               $(".appointmentContainer").css("display","none"); 
               $(".myDoctorContainer").css("display","none");
               
               $(".placeSearcher").on("input",function(){
                    var val=$(this).val();
                    if(val!=="")
                    {
                $.ajax({
                type:"POST",
                url:"hospitalRetriver",
                data:{
                   placeName:$(".placeSearcher").val(),
                   specName:specializationName,
                   function:"hospital"
                },
                success: function (data, textStatus, jqXHR) {
                    //alert(data);
                    var array=new Array();
                    var array1=new Array();
                    $(".hospitalContent").html("");
                    if(data.includes("|"))
                    {    
                    array=data.split("|");
                    for(var x=0;x<array.length-1;x++)
                    {
                        array1=array[x].split(",");
                          $(".hospitalContent").append(
                                  "<div class='myHospital' >\n\
                                        <div class='card-body'>\n\
                                                 <h5 class='card-header'>\n\
                                                       "+array1[1]+"\n\
                                                 </h5>\n\
\n\                                                  <hr style='color:grey'>\n\
\n\                                              <div class='hospital_details'>  \n\
                                                  <div class='container1'>   \n\
                                                 <p class='card-text'>\n\
                                                      Hosiptal Adress : "+array1[2]+"\n\
                                                 </p>\n\
\n\                                              <p class='card-text'>\n\
                                                      Hospital founded date : "+array1[3].slice(0,11)+"  \n\
\n\                                               </p> \n\
\n\                                              <p class='card-text'>\n\
                                                      Number of Doctors : "+array1[4]+"\n\
\n\                                               </p> \n\
\n\
\n\                                              <p class='card-text'>\n\
                                                      Number of Nurses : "+array1[5]+"\n\
\n\                                              </p>\n\
\n\                                                 </div>  \n\
                                                  <div class='container2'>   \n\
\n\                                              <p class='card-text'>\n\
                                                      Number of Rooms : "+array1[6]+"\n\
\n\                                               </p> \n\
\n\                                              <p class='card-text'>\n\
                                                      Number of Beds : "+array1[7]+"\n\
\n\                                               </p> \n\
\n\                                              <p class='card-text'>\n\
                                                      Number of Floors : "+array1[8]+"\n\
\n\                                               </p> \n\
\n\                                              <p class='card-text'>\n\
                                                       Place located : "+array1[9]+"\n\
\n\                                               </p> \n\
\n\                                                </div>  \n\
                                                  <div class='container3'>   \n\
\n\
\n\                                              <p class='card-text'>\n\
                                                      Contact Number : "+array1[10]+"\n\
\n\                                               </p> \n\
\n\                                              <p class='card-text'>\n\
                                                      Number of ICU_wards : "+array1[11]+"\n\
\n\                                               </p> \n\
\n\                                              <p class='card-text'>\n\
                                                      Number of Operation theater : "+array1[12]+"\n\
\n\                                               </p> \n\
\n\                                              <p class='card-text'>\n\
                                                      Number of Test Labs : "+array1[13]+"\n\
\n\                                               </p> \n\
                                                     </div>   \n\
                                                  </div>   \n\
                                        </div>\n\
                                    <button class='btn btn-primary hid' id="+array1[0]+" name="+specializationName+">\n\
                                            Start Booking<span style='font-size:15px;'>&#10087;</span>\n\
                                    </button>\n\
                                </div>\n\
                                "
                          );
                        }
                    }
                  
                  else
                  {
                      $(".hospitalContent").html(data);
                  }
                }
               }
             );
           }
               });
           
            $(document).on("click",".hid",function(){
                  $(".profileContainer").css("display","none");
                  $(".appointmentContainer").css("display","none");
                  $(".menuHeaderContent").html("Doctor Available Now");
                  $(".cardDecker").css("display","none");
                  $(".specializationContainer").css("display","none");
                  $(".placeSearcher").val("select");
                  $(".hospitalContent").html("");
                  $(".doctorContainer").css("display","block");
                  $(".hospitalContainer").css("display","none");
                  $(".myDoctorContainer").css("display","none");
                 var hid=$(this).attr("id");
                 var name=$(this).attr("name");
                 var imageArray=new Array();
                 window.console.log(name);
                 $.ajax({
                    type:"POST",
                    url:"hospitalRetriver",
                    data:{
                      hospitalId:hid,
                      specName:name,
                      function:"doctor"
                    },
                    success: function (data, textStatus, jqXHR) {
                         var array=new Array();
                    var array1=new Array();
                    $(".doctorContent").html("");
                    if(data.includes("|"))
                    {    
                    array=data.split("|");
                    for(var x=0;x<array.length-1;x++)
                    {
                        array1=array[x].split(",");
                        imageArray.push(array1[4]);
                        var DID=array1[0];
                $(".doctorContent").append("\n\
\n\ \n\
                            <div class='mydoctor'>\n\
                                  <div class='docImage'>        \n\
                                      <img class='doctorImage"+x+" doctorImageCss' src=''>            \n\
                                   </div>  \n\
                                   <div class='container4'>     \n\
                                       <p>Name : "+array1[1]+"</p>  \n\
                                       <p>Address : "+array1[2]+"</p>\n\
                                       <p>Place : "+array1[3]+"</p>\n\
                                       <p>email : "+array1[4]+"</p>\n\
                                       <p>Phone Number : "+array1[5]+"</p>                                        \n\
                                       <p>Gender : "+array1[6]+"</p>   \n\
                                       <p>Specialization : "+array1[7]+"</p>\n\
                                       <p>Qualificatoin : "+array1[8]+"</p> \n\
                                       <p>Experience : "+array1[9]+" </p> \n\
                                       <p>      \n\
                                   </div>       \n\
   \n\
                              </div> \n\
                                     <button class='btn btn-primary docId' type='button' name='"+DID+"' data-toggle='modal' data-target='#myModal"+x+"' >Book </button> \n\
         <div class='modal' id='myModal"+x+"'>\n\
            <div class='modal-dialog modal-dialog-centered'>\n\
                <div class='modal-content'>\n\
                    <div class='modal-header'>\n\
                        <h4 class='modal-title'>Hey patient see below </h4>\n\
                    </div>\n\
                    <div class='modal-body'>\n\
                        <p></p>\n\
                    </div>\n\
                    <div class='modal-footer'>\n\
                        <button class='btn btn-primary' data-dismiss='modal'>Ok</button>\n\
                    </div>\n\
                </div>\n\
            </div>\n\
        </div>");
                              
                    } 
                     for(var t=0;t<imageArray.length;t++)
                     {                       
                          $(".doctorImage"+t).attr("src","./pateintimageRetriver?email="+imageArray[t]+"&role=doctor");
                     }
                    }
                 }
            });
        }); 
                 
            $(".mainContent *").on("click",function(){
                var left=$(".menuList").css("left");
                if(left==="0px")
                {    
                    $(".menuList").animate({
                        left:"-55%"
                    });
                }            
            });
              $("#firstname").on("blur",function(){
                         var warn=$(this).val();
                         //alert(warn);
                         $(".alert-fname").css("display","none");
                         var reg=new RegExp("^[a-zA-Z]{1,}$");
                         if(!reg.test(warn) && warn!=='')
                         {
                             $(".btn").prop("disabled","true");
                             $(".alert-fname").fadeIn(500).css("display","block");
                         }
                         else
                         {
                             $(".alert-fname").css("display","none");
                             $(".btn").removeAttr("disabled");
                         }
                     });
                     $("#lastname").on("blur",function(){
                         var warn=$(this).val();
                         //alert(warn);
                         $(".alert-lname").css("display","none");
                         var reg=new RegExp("^[a-zA-Z]{1,}$");
                         if(!reg.test(warn) && warn!=='')
                         {
                             $(".btn").prop("disabled","true");
                             $(".alert-lname").fadeIn(500).css("display","block");
                         }
                         else
                         {
                             $(".alert-lname").css("display","none");
                             $(".btn").removeAttr("disabled");
                         }
                     });
                    $("#occupation").on("blur",function(){
                         var warn=$(this).val();
                         //alert(warn);
                         $(".alert-Oname").css("display","none");
                         var reg=new RegExp("^[a-zA-Z]{1,}$");
                         if(!reg.test(warn) && warn!=='')
                         {
                             $(".btn").prop("disabled","true");
                             $(".alert-Oname").fadeIn(500).css("display","block");
                         }
                         else
                         {
                             $(".alert-Oname").css("display","none");
                             $(".btn").removeAttr("disabled");
                         }
                     });
                 $('#email').on("blur",function()  {
                        var email_address=$(this).val();
                        var email_regex=new RegExp( "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$");                        
                        $(".alert-Ename").css("display","none");
                        if(!email_regex.test(email_address) && email_address!=='')
                        {
                           $(".btn").prop("disabled","true");
                             $(".alert-Ename").fadeIn(500).css("display","block"); 
                        }
                        else
                        {
                          $(".alert-Ename").css("display","none");
                             $(".btn").removeAttr("disabled");   
                        }
                     });
                   $("#occupation").on("blur",function(){
                         var warn=$(this).val();
                         //alert(warn);
                         $(".alert-Oname").css("display","none");
                         var reg=new RegExp("^[a-zA-Z]{1,}$");
                         if(!reg.test(warn) && warn!=='')
                         {
                             $(".btn").prop("disabled","true");
                             $(".alert-Oname").fadeIn(500).css("display","block");
                         }
                         else
                         {
                             $(".alert-Oname").css("display","none");
                             $(".btn").removeAttr("disabled");
                         }
                     });         
                      $("#phonenumber").on("blur",function(){
                         var warn=$(this).val();
                         //alert(warn);
                         $(".alert-Pname").css("display","none");
                         var reg=new RegExp("^[0-9]{1,}$");
                         if(!reg.test(warn) && warn!==''||warn.length<10)
                         {
                             $(".btn").prop("disabled","true");
                             $(".alert-Pname").fadeIn(500).css("display","block");
                         }
                         else
                         {
                             $(".alert-Pname").css("display","none");
                             $(".btn").removeAttr("disabled");
                         }
                         //(?i).*\.(gif|jpe?g|png|bmp)$
                     });
                     $("#photo").on("blur",function(){
                         var warn=$(this).val();
                         //alert(warn);
                         $(".alert-PHname").css("display","none");
                         var reg=new RegExp(".*\.(gif|jpe?g|png|bmp)$");
                         if(!reg.test(warn) && warn!=='')
                         {
                             $(".btn").prop("disabled","true");
                             $(".alert-PHname").fadeIn(500).css("display","block");
                         }
                         else
                         {
                             $(".alert-PHname").css("display","none");
                             $(".btn").removeAttr("disabled");
                         }
                        
                     });
                     
                     $("#login").on("click",function(){
                        var firstName=$("#firstname").val();
                        var lastName=$("#lastname").val();
                        var BirthDate=$("#birthdate").val();
                        var occupation=$("#occupation").val();
                        var sex=$("#sex").val();
                        var Email=$("#email").val();
                        var phoneNumber=$("#phonenumber").val();
                        var address=$("#address").val();
                        var placeName=$("#place_name").val();
                        var age=$("#age").val();
                        var height=$("#height").val();
                        var weight=$("#weight").val();
                        var bloodGroup=$("#bloodtype").val();
                        var bodyMark=$("#body_marks").val();
                        $.ajax({
                           type:"POST",
                           url:"upadter",
                           data:{
                               data1:firstName,
                               data2:lastName,
                               data3:BirthDate,
                               data4:occupation,
                               data5:sex,
                               data6:Email,
                               data7:phoneNumber,
                               data8:address,
                               data9:placeName,
                               data10:age,
                               data11:height,
                               data12:weight,
                               data13:bloodGroup,
                               data14:bodyMark,
                               data15:email,
                               function:"update",
                               role:"patient"
                           },
                           success: function (data, textStatus, jqXHR) {
                              $(".updateContent").html("Hey "+firstName+" your datails have been "+data);
                              $(".update").css("display","block");
                              $(".update").css("z-index","100");
                            }
                        });
                        $(".close").on("click",function(){
                           $(".update").css("display","none"); 
                        });
                 });
                 $(document).on("click",".docId",function(){
                     var did=$(this).attr("name");
                    
                     $.ajax({
                         type:"POST",
                         url:"bookingControlller",
                         data:{
                             doctorId:did,
                             email:email,
                             reason:specializationName
                         },
                         success: function (data, textStatus, jqXHR) {
                             if(data==="success")
                             {
                                 $(".modal-body p").html("Successfully Booked!!");
                             }
                             else
                             {
                                 $(".modal-body p").html("Sorry appointment can  be fixed only once for a doctor.You can book once your previous appointment finsihed!!");   
                             }
                         }
                     });
                 });
                       $(".appointmentLink").on("click",function(){
                         $(".appointmentContainer").css("display","block");
                         $(".profileContainer").css("display","none");
                         $(".menuHeaderContent").html("Your appointments");
                         $(".cardDecker").css("display","none");
                         $(".specializationContainer").css("display","none");
                         $(".placeSearcher").val("select");
                         $(".hospitalContent").html("");
                         $(".doctorContainer").css("display","none");
                         $(".hospitalContainer").css("display","none"); 
                         $(".myDoctorContainer").css("display","none");
                         var docImageArray=new Array();
                         var docDeatailArray=new Array();
                         var appointmentDeatilArray=new Array();
                         alert(email);
                         $.ajax({
                             type:"POST",
                             url:"appointmentController",
                             data:{
                                 email:email,
                                 function:"request"
                             },
                             success: function (data, textStatus, jqXHR) {
                              docDeatailArray=data.split("|");
                               $(".appointmentContent").html("");
                              for(var x=0;x<docDeatailArray.length-1;x++)
                              {
                                  appointmentDeatilArray=docDeatailArray[x].split(",");
                                  docImageArray.push(appointmentDeatilArray[3]);
                                  if(appointmentDeatilArray[13]!=="Yes")
                                  {   
                                  if(appointmentDeatilArray[10]==="null")
                                  {
                                      appointmentDeatilArray[10]="Not Decided";
                                  }
                                  if(appointmentDeatilArray[12]==="null")
                                  {
                                      appointmentDeatilArray[12]="Not Decided";     
                                  }
                                 $(".appointmentContent").append(
                                        "<div class='appointmentMainContent' id='"+appointmentDeatilArray[9]+"'><div class='bookedDocImageContainer'>\n\
                                             <img class='profileDocImage"+x+" prodocImage ' src=''>\n\
                                        </div>\n\
                                        <div class='docDetailContainer'>\n\
                                               <h4>Doctor Details</h4> \n\
                                                     \n\
                                                <div class='docDetail'>\n\
                                                     <p>Name : "+appointmentDeatilArray[0]+"</p>   \n\
                                                     <p>Address : "+appointmentDeatilArray[1]+"</p>   \n\
                                                     <p>Place_of_working : "+appointmentDeatilArray[2]+"</p>   \n\
                                                     <p>Email : "+appointmentDeatilArray[3]+"\n\
                                                     <p>Phone Number : "+appointmentDeatilArray[4]+"</p>   \n\
   \n\                                               <p>Gender : "+appointmentDeatilArray[5]+"</p>   \n\
   \n\                                               <p>Specialization : "+appointmentDeatilArray[6]+"</p>   \n\
   \n\                                               <p>Qualification : "+appointmentDeatilArray[7]+"</p>   \n\
   \n\                                               <p>Experience : "+appointmentDeatilArray[8]+"</p>   \n\
   \n\
                                               </div>   \n\
                                        </div> \n\
                                        <div class='appointmentDetailContainer'>\n\
                                               <h4>AppointmentDetail</h4>  \n\
                                                <div class='appointmentDetail' id='"+appointmentDeatilArray[9]+"'> \n\
                                                    <p>Appointment Date : "+appointmentDeatilArray[10]+"</p>    \n\
                                                    <p>Appointment Reason :"+appointmentDeatilArray[11]+"</p>    \n\
                                                    <p>Appointment Time : "+appointmentDeatilArray[12]+"</p>    \n\
                                                    <p>Appointment Confirmation : "+appointmentDeatilArray[13]+"</p>    \n\
\
                                                </div>\n\
                                        </div> \n\
                                       <div class='RemoveButton' id='"+appointmentDeatilArray[9]+"'>\n\
                                         <button class='btn btn-danger'>Remove</button>\n\
                                    </div>\n\
                                </div>"
                                        
                                  );  
                                  }
            
                              }
                              for(var y=0;y<docImageArray.length;y++)
                              {
                                 
                                  $(".profileDocImage"+y).attr("src","./pateintimageRetriver?email="+docImageArray[y]+"&role=doctor");      
                                   
                             }
                             }
                         });
                  
                      
                 });
                 var cancelButton;
                   setInterval(function(){
                       
                      $.ajax({
                         type:"POST",
                         url:"NotificationController",
                         data:{
                             email:email,
                             role:"patient"
                         },
                         success: function (data, textStatus, jqXHR) {
                             cancelButton=data;
                           if(data!=="0")
                           {
                              $(".notifiactions").html(data); 
                              
                           }
                           else
                           {
                           }
                         }
                      });  
                    },60000);   
                    $(".doctorLink").on("click",function(){
                        $(".appointmentContainer").css("display","none");
                         $(".profileContainer").css("display","none");
                         $(".menuHeaderContent").html("Working Area");
                         $(".cardDecker").css("display","none");
                         $(".specializationContainer").css("display","none");
                         $(".placeSearcher").val("select");
                         $(".hospitalContent").html("");
                         $(".doctorContainer").css("display","none");
                         $(".hospitalContainer").css("display","none"); 
                         $(".myDoctorContainer").css("display","block");
                         
                    });
                     var docImageArray1=new Array();
                     var docDeatailArray1=new Array();
                     var appointmentDeatilArray1=new Array();
                    $(document).on("click",".doctorsFixed",function(){
                        $(".noteContainer").css("display","none");
                        $(".fixedDoctorDetails").css("display","block");
                       $.ajax({
                             type:"POST",
                             url:"appointmentController",
                             data:{
                                 email:email,
                                 function:"confirmed"
                             },
                             success: function (data, textStatus, jqXHR) {
                                   
                              docDeatailArray1=data.split("|");
                               $(".fixedDoctorDetails").html("");
                              for(var x=0;x<docDeatailArray1.length-1;x++)
                              {
                                  appointmentDeatilArray1=docDeatailArray1[x].split(",");
                                  docImageArray1.push(appointmentDeatilArray1[3]);
                                
                                 $(".fixedDoctorDetails").append(
                                        "<div class='appointmentMainContent1' id='"+appointmentDeatilArray1[9]+"'><div class='bookedDocImageContainer1'>\n\
                                             <img class='profileDocImage1"+x+" prodocImage ' src=''>\n\
                                        </div>\n\
                                        <div class='docDetailContainer1'>\n\
                                               <h4>Doctor Details1</h4> \n\
                                                     \n\
                                                <div class='docDetail'>\n\
                                                     <p>Name : "+appointmentDeatilArray1[10]+"</p>   \n\
                                                     <p>Address : "+appointmentDeatilArray1[1]+"</p>   \n\
                                                     <p>Place_of_working : "+appointmentDeatilArray1[2]+"</p>   \n\
                                                     <p>Email : "+appointmentDeatilArray1[3]+"\n\
                                                     <p>Phone Number : "+appointmentDeatilArray1[4]+"</p>   \n\
   \n\                                               <p>Gender : "+appointmentDeatilArray1[5]+"</p>   \n\
   \n\                                               <p>Specialization : "+appointmentDeatilArray1[6]+"</p>   \n\
   \n\                                               <p>Qualification : "+appointmentDeatilArray1[7]+"</p>   \n\
   \n\                                               <p>Experience : "+appointmentDeatilArray1[8]+"</p>   \n\
   \n\
                                               </div>   \n\
                                        </div> \n\
                                        <div class='appointmentDetailContainer1'>\n\
                                               <h4>AppointmentDetail</h4>  \n\
                                                <div class='appointmentDetail' id='"+appointmentDeatilArray1[9]+"'> \n\
                                                    <p>Appointment Date : "+appointmentDeatilArray1[10]+"</p>    \n\
                                                    <p>Appointment Reason :"+appointmentDeatilArray1[11]+"</p>    \n\
                                                    <p>Appointment Time : "+appointmentDeatilArray1[12]+"</p>    \n\
                                                    <p>Appointment Confirmation : "+appointmentDeatilArray1[13]+"</p>    \n\
\
                                                </div>\n\
                                        </div> \n\
                                       <div class='RemoveButton1' id='"+appointmentDeatilArray1[9]+"'>\n\
                                         <button class='btn btn-danger'>Remove</button>\n\
                                    </div>\n\
                                </div>"
                                        
                                  );  
                                  }
                                for(var y=0;y<docImageArray1.length;y++)
                                {
                                  $(".profileDocImage1"+y).attr("src","./pateintimageRetriver?email="+docImageArray1[y]+"&role=doctor");      
                                   
                                }
            
                              }
                              
                          });
                              
                          
                    });
                    $(document).on("click",".Note",function(){
                       $(".fixedDoctorDetails").css("display","none");
                       $(".noteContainer").css("display","block");
                       $(".noteContainer").html("\n\
                            <form> \n\
                                <div class='form-group'>\n\
                                     <label for='reason'>\n\
                                            Enter the Issue : \n\
                                     </label>\n\
                                     <textarea class='form-control' id='reason' name='reason' rows='15' cols='30'>\n\
                                     </textarea></div>   \n\
\n\                             <div class='form-group'><label for='symptoms'>Enter the Symptoms : </label><textarea  class='form-control' id='Symptoms' name=symptoms' rows='15' cols='30'></textarea></div>  \n\
                                <div class='form-group'><label for='effects'>Enter the Body Changes : </label><textarea class='form-control' id='effects' name='effects' rows='15' cols='30'></textarea></div> \n\
                                <div class='form-group'><label for='complication'>Enter if you have medical complications : </label><textarea class='form-control' id='complication' name='complication' rows='15' cols='30'></textarea></div> \n\
                                 \n\
                                       \n\
                            </form>  \n\
                                <div class='buttonFixer'> \n\
                                      <a class='btn btn-primary'>Send</a> \n\
                                </div>      \n\
                        ");
                    });
                $(document).on("click",".RemoveButton1",function(){
                    var remove=$(".RemoveButton1").attr("id");
                    $.ajax({
                        type:"POST",
                        url:"AppointmentFixerandCancelerController",
                        data:{
                            presId:$(".RemoveButton1").attr("id"),
                            function:"cancel"
                        },
                        success: function (data, textStatus, jqXHR) {
                            if(data==="true")
                            {
                               $("#"+remove).addClass("animation1").delay(500).queue(function(next){
                                  $("#"+remove).css("display","none"); 
                                  next();
                               }); 
                            }
                        }
                        
                    })
                });
                   $(document).on("click",".RemoveButton",function(){
                    var remove=$(".RemoveButton").attr("id");
                    $.ajax({
                        type:"POST",
                        url:"AppointmentFixerandCancelerController",
                        data:{
                            presId:$(".RemoveButton").attr("id"),
                            function:"cancel"
                        },
                        success: function (data, textStatus, jqXHR) {
                            if(data==="true")
                            {
                               $("#"+remove).addClass("animation1").delay(500).queue(function(next){
                                  $("#"+remove).css("display","none"); 
                                  next();
                               }); 
                            }
                        }
                        
                    })
                });                    
        </script>
    </body>
</html>
