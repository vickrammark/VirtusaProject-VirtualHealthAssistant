<%-- 
    Document   : patientRegistration
    Created on : Jul 13, 2020, 1:12:51 PM
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
  <link rel="stylesheet" href="styles/patientRegistration.css"> 
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
        <h3 class="header">Patient SignUp Form</h3>
        <div class="container-fluid firstContainer">
            <form   method="POST"  class="fname" action="intermediatorChecker" enctype="multipart/form-data">
                  <div class="row"> 
                   <div class="sideContainer1 col-lg-4 col-sm-6">
                       <div class="alert alert-danger alert-Sname">
                           <p>Sorry!!! user already exist with same mail Id or  you are trying to resubmit your data.</p><span><b>Note:-</b> You can't  enter the same phone number and email.please use a different one.</span> 
                           <span class="close" data-dismiss="alert">&times;</span>
                       </div>
                       <div class="form-group">
                           <label for="phonenumber">You role:</label>
                           <input class="form-control" type="text" name="role" value="patient" id="role" >
                       </div>
                       <div class="form-group">
                           <div class="alert alert-fname alert-dismissible alert-danger">Name cannot contain special character and numbers!!</div>  
                           <label for="firstname">Enter First Name:</label>
                           <input class="form-control" type="text" id="firstname" name="firstname" placeholder="First Name" required maxlength="16">
                       </div>
                       <div class="form-group">
                           <div class="alert alert-lname alert-dismissible alert-danger">Name cannot contain special character and numbers!!</div>       
                           <label for="lastname">Enter Last Name:</label>
                           <input class="form-control" type="text" id="lastname" name="lastname" placeholder="Last Name" required maxlength="16">
                       </div>
                       <div class="form-group">
                           <label for="birthdate">Enter birthdate:</label>
                           <input class="form-control" type="date" id="birthdate" name="birthdate"  required >
                       </div>
                       <div class="form-group">
                          <div class="alert alert-Oname alert-dismissible alert-danger">Occupation cannot contain special character and numbers!!</div>     
                           <label for="occupation">Enter Your Occupation:</label>
                           <input class="form-control" type="text" id="occupation" name="occupation" placeholder="Occupation" required maxlength="16">
                       </div>
                       <div class="form-group">
                           <label for="sex">Select your sex:</label>
                           <select name="sex" id="sex" required class="form-control">
                               <option value="">select</option>
                               <option value="male">Male</option>
                               <option value="female">Female</option>
                               <option value="other">Other</option>
                           </select>
                       </div>        
                       <div class="form-group">
                           <div class="alert alert-Ename alert-dismissible alert-danger">Email format entered is wrong!!</div>         
                           <label for="email">Enter Your Email:</label>
                           <input class="form-control" type="email" id="email" name="email" placeholder="Email" required maxlength="30">
                       </div>                       
                       <div class="form-group">
                           <div class="alert warnPass  alert-dismissible alert-danger"></div>               
                           <label for="password">Enter Your Password</label>
                           <input class="form-control" type="password" id="password" name="password" placeholder="Password" required maxlength="20">
                       </div>
                   </div>
                   <div class="sideContainer2 col-lg-4 col-sm-6">
                       <div class="form-group">
                           <div class="alert  alert-Pname alert-dismissible alert-danger">Phone Number should contain only numbers and should be 10 digits</div>                          
                           <label for="phonenumber">Enter Your Phone Number:</label>
                           <input class="form-control" type="text" name="phonenumber" id="phonenumber" placeholder="Phone Number" required maxlength="10">
                       </div>
                       <div class="form-group">
                           <label for="address">Enter Your Address:</label>
                           <input class="form-control" type="text" name="address" id="address" placeholder=" Address" required maxlength="30">
                       </div>
                       <div class="form-group">
                           <label for="place_name">Enter Your Place Name:</label>
                           <select name=place_name id="place_name" required class="form-control">
                               <option value="">select</option>
                               <option value="dindugul">Dindugul</option>
                               <option value="madurai">Madurai</option>
                               <option value="coimbatore">Coimbatore</option>
                           </select>
                       </div>
                       <div class="form-group">
                           <label for="age">Enter Your Age:</label>
                           <input class="form-control" type="number" name="age" id="age" placeholder="Age">
                       </div>
                       <div class="form-group">
                           <label for="height">Enter Your Height:</label>
                           <input class="form-control" type="number" name="height" id="height" placeholder="Height">
                       </div>
                       <div class="form-group">
                           <label for="weight">Enter Your weight:</label>
                           <input class="form-control" type="number" name="weight" id="weight" placeholder="Weight">
                       </div>
                       <div class="form-group">
                           <label for="blood_group">Select Your Blood Group:</label>
                           <select name="blood_group" id="blood_group" required class="form-control">
                               <option value="">select</option>
                               <option value="A">A</option>
                               <option value="B">B</option>
                               <option value="O">O</option>
                               <option value="AB">AB</option>
                           </select>
                         </div>
                           
                   </div>
                 <div class="sideContainer3 col-lg-4 col-sm-8">
                     <div class="form-group"> 
                               <label for="bloodtype">Select Your Blood Type:</label>
                               <select disabled name="bloodtype" id="bloodtype" required class="form-control">   
                               </select>
                           </div>
                       <div class="form-group">
                           <label for="body_marks">Enter Your Body Mark(if any):</label>
                           <input name="body_marks" id="body_marks" class="form-control" type="text" maxlength="10" placeholder="Body Marks"/>
                       </div>
                       <div class="form-group">
                           <div class="alert alert-danger alert-PHname alert-dismissible">Photo should be .jpeg/ .jpg/ .png/ .bmp</div>
                           <label for="photo">Please upload you photo:</label>
                           <input name="photo" id="photo" class="form-control p-1" type="file" multiple/>    
                       </div>   
                       <div class="form-group">
                           <input id="login" class="btn btn-primary" type="submit" value="Save"/>
                       </div>
                       </div>
                   </div>
            </form>
        </div>
        <%
            HttpSession session1=request.getSession();
            String s=(String)session1.getAttribute("message");
        %>
        <script>
                         
                        if ( window.history.replaceState ) {
        window.history.replaceState( null, null, window.location.href )
                       }
                       var success=<%=s%>;
                       alert(success);
                      window.console.log(success);
                        if(success==false)
                        {
                          $(".alert-Sname").css("display","block");
                        }

                        $("#blood_group").on("input",function(){
                        var blood=$("#blood_group").val();
                        if(blood.length!=="select")
                        {
                           $("#bloodtype").removeAttr("disabled");
                           if(blood==='A')
                           {    
                           $("#bloodtype").html("<option value='A+'>A+</option>\n\
                                                 <option value='A-'>A-</option>");
                           }
                           if(blood==='B')
                           {    
                           $("#bloodtype").html("<option value='B+'>B+</option>\n\
                                                 <option value='B-'>B-</option>");
                           }
                           if(blood==='O')
                           {    
                           $("#bloodtype").html("<option value='O+'>O+</option>\n\
                                                 <option value='O-'>O-</option>");
                           }
                           if(blood==='AB')
                           {    
                           $("#bloodtype").html("<option value='AB+'>AB+</option>\n\
                                                 <option value='AB-'>AB-</option>");
                           }   
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
              
                 $("#password").on("blur",function(){
                     $("#login").prop("disabled","true");
                     var pass=$(this).val();
                     var pattern = new RegExp("[a-z]{1,}");
                     var pattern1=new RegExp("[A-Z]{1,}");
                     var pattern2=new RegExp("[0-9]{1,}");
                     var pattern3=new RegExp("[@#$%&*]{1,}");
                     if(pass.length<8)
                     {
                         $(".warnPass").css("display","none"); 
                         $(".warnPass").fadeIn(500).css("display","block");
                         $(".warnPass").html("password should have more than 8 charachters and less than 20 charachters");
                     }
                     else if(!pattern.test(pass))
                     {
                         $(".warnPass").css("display","none"); 
                         $(".warnPass").fadeIn(500).css("display","block");
                         $(".warnPass").html("password must have at least 1 lowerCase");   
                     } 
                     else if(!pattern1.test(pass))
                     {
                         $(".warnPass").css("display","none");                        
                         $(".warnPass").fadeIn(500).css("display","block");
                         $(".warnPass ").html("password must have at least 1 UpperCase");   
                     }
                     else if(!pattern2.test(pass))
                     {
                         $(".warnPass").css("display","none");                 
                         $(".warnPass").fadeIn(500).css("display","block");
                         $(".warnPass ").html("password must have at least 1 numeric value");                                 
                     }
                     else if(!pattern3.test(pass))
                     {
                         $(".warnPass").css("display","none");                      
                         $(".warnPass").fadeIn(500).css("display","block");
                         $(".warnPass").html("password must have at least 1 special character");       
                     }
                     else
                     {
                         $(".warnPass").fadeOut(500).css("display","none"); 
                         $("#login").removeAttr("disabled");    
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
        </script>
    </body>
</html>
