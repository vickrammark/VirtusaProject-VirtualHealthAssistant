<%-- 
    Document   : Login
    Created on : Jul 11, 2020, 11:08:39 AM
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
  <link rel="stylesheet" href="styles/Login.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

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
               
       
        <div class="container-fluid firstContainerImage">
              <div class="container alertbox" style="margin: 10px">
                <div class="alert alert-danger alert-dismissible">
                    Invalid User Credentials!!!
                    <span class="close" data-dismiss="alert">&times;</span>
                </div>
              </div>     
            <div class="firstContainer col-lg-5 col-sm-5 col-xs-12">
                <form class="Fname" method="POST" action="pageDirector">
                <label class="form-label" for="Email">Enter Email:</label>
                <input class="form-control mb-3" id="Email" name="Email" placeholder="Email" maxlength="30" type="email" required/>
                <div class="container bg-warning warnPass"><span>&#x26A0;</span><span></span></div> 
                <label class="form-label" for="Password">Enter Password:</label>
                <input class="form-control mb-3" id="Password" name="Password" placeholder="Password" maxlength="30" type="password" required/>
                <label class="form-label">Select your role:</label>
                    <select name="role" class="form-control mb-3" required style="font-size:20px" >
                        <option value="">select</option>   
                        <option value="doctor">Doctor</option>
                        <option value="patient">Patient</option>
                        <option value="lab technician">Lab Technician</option>
                    </select>
                <label class="form-label">Select your place:</label>
                    <select name="place" class="form-control mb-3" required style="font-size:20px" >
                        <option value="">select</option>        
                        <option value="dindugul">Dindugul</option>
                        <option value="coimbatore">Coimbatore</option>
                        <option value="madurai">Madurai</option>
                    </select>
                <div class="LRbutton">
                <input type="submit" id="login" value="Login" class="btn btn-primary" >   
                <input type="reset" value="Reset" class="btn btn-danger">
                </div>
                </form>
                <div class="forget">
                <a href="forgetPassword.jsp" class="btn btn-primary mt-5" style="font-size: 20px">Forget Password ?</a>
                </div>
             </div>
        </div>
        <div class="PatientSuggestionContainer container-fluid">
            <h3 class="PateintSuggestionHeader">
                Patient Stories – How Smitha Found Help To Provide World Class Care For Her Father?
            </h3>
            <p class="PateintSuggestionContent">
                My father is a neuro patient who was treated at Medanta hospital for a month. As a result of brain haemorrhage, he is bed ridden and not able to walk or eat on his own. Due to his critical condition, we had to arrange for a 24 hour nurse and physio-therapy at the time of shifting him home to help him with recovery. After a lot of research, we decided to go with Portea as not only does Portea provides trained nurses and physio therapists but they also provide medical equipments such as an ICU bed etc which one can take on rent. 
Post telephonic conversations, our first interaction was with Abhishek Dubey who visited my father at the hospital to help us decide what kind of nurse we will require and what all equipments we will need. He spent quality time with my family to understand the condition of my father and accordingly arranged for a nurse and equipments for us. His service has been top notch and I am very thankful to him for his continued support till date. Portea team also visited our home and got the room ready before my father was shifted. Abhishek also helped with this process.
The first nurse assigned to us was Mahendra, who came to Medanta hospital early in the morning on the day of  discharge to take a proper handover from the hospital nurses. He travelled in the ambulance with my father and ensured my father was moved safely from the hospital to home. Mahendra was with us for almost 20 days and he did a fabulous job of taking care of my father. I would highly recommend Mahendra for any neuro patient who requires critical care. Not only was Mahendra good at his job, but he was also good natured and forever smiling which helped having him around a joy. Mahendra has recently been replaced Mr Renju and he too is extremely good from what I hear from my mother and so far we are very happy with his services. I will leave a detailed feedback on Mr Renju after he has spend some more time with us. 
I have also communicated with the head of nursing coordinator Mr Sarvesh and he too is very prompt and helpful. Dr Ankit who is co-ordinator for physio-therapists is also very responsive and helpful.
The physio-therapist assigned to my father Mr Sandeep is extremely good too and with his continued effort and regular session, my father is reasonable mobile than he was a few weeks ago.
Thanks to the joint effort of Team Portea that we are able to provide good care to my father. 
            </p>
        </div>
        <script>
                  var message=<%=(String)request.getAttribute("message")%>;
                  window.console.log(message);
                  if(message==false)
                  {
                      $(".alert").css("display","block");
                  }
          </script>         
</html>
