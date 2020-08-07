<%-- 
    Document   : index
    Created on : Jul 7, 2020, 8:35:05 PM
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
  <link rel="stylesheet" href="styles/intro.css"> 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container-fluid headerContainer">
                <h1 class="header">VIRTUAL HEALTH ASSISTANT</h1>
        </div>
        <nav class="navbar navbar-expand-sm mt-3" style="background-color:blueviolet">
               <ul class="navbar-nav">
                   <li class="nav-item">
                       <a class="nav-link" href="#" style="color:white;font-size:20px;font-weight:bold">Home</a>
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
                       <a class="nav-link" href="#" style="color: white;font-size:20px;font-weight:bold">SignUp</a>
                   </div>
                </div>
          </nav>
        <div class="container-fluid">
            
        </div>
        <div class="row firstContainer mt-4">
                       
            <div class="container col-lg-3  col-sm-6 col-xs-12 imgContainer1">
                <img src="images/laptop.png" class="fig1">
            </div>
            <div class="container col-lg-9 col-sm-6 col-xs-12">
                <h4 class="aboutHeader">About Us</h4>
                <p class="aboutContent">
                    We are the peoples who are constantly  working and creating connections between you people
                    and the most highly qualified doctors to take care of you.We assure you that we will give 
                    at most satisfaction.You can lead a happily life with our service.Customers are our profit
                    nothing more than that.We serve our customer in variety of ways and will always achieve the full
                    satisfaction of our customer
                </p>
            </div> 
        </div>  
         <div class="row secondContainer mt-4">
                       
            <div class="container col-lg-3 col-sm-6 col-xs-12 imgContainer2">
                <img src="images/setshscope.jpg" class="fig2">
            </div>
            <div class="container col-lg-9 col-sm-6 col-xs-12">
                <h4 class="workHeader">What do we do?</h4>
                <p class= "workContent">
                    We use the power of web technology provide the people a good online communication and maintaining
                    of records between patient and the doctors.We observe the health of patient and provide responsive
                    and immediate notification.Give you the daily updates of you reports and you can consult with your
                    doctor through our message and mail services.
                </p>  
           </div> 
        </div>
        <hr>
         <div class="mycard mt-4">
            <div class="container card  cardContainer m-2 col-lg-2 col-sm-5 col-xs-12">
                <img class="card-img-top" src="images/about-us.png" style="width:100%;height:200px">   
                <div class="card-body">
                    <h5 class="card-header">Know about Us</h5>
                    <p class="card-text">
                        To know more about us and our
                        process click below
                    </p>
                </div>
                <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10097;</span></button>
            </div>
             <div class="container card cardContainer m-2 col-lg-2 col-sm-5 col-xs-12" >
                 <img class="card-img-top" src="images/locationPosition.png" style="width:100%;height:200px">   
                <div class="card-body">
                    <h5 class="card-header">Know our locations</h5>
                    <p class="card-text">
                        To know where we are in your city please click below
                    </p>
                </div>
                <button class="container btn btn-primary">See More <span style='font-size:15px;'>&#10097;</span></button>
           </div>
            <div class="container card  cardContainer m-2 col-lg-2 col-sm-5 col-xs-12">
                <img class="card-img-top" src="images/achivement.png" style="width:100%;height:200px">   
                <div class="card-body">
                    <h5 class="card-header">Know about our achievements</h5>
                    <p class="card-text">
                       To know more about our achievements click below
                    </p>
                </div>
                <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10097;</span></button>
           </div>
            <div class="container card cardContainer m-2 col-lg-2 col-sm-5 col-xs-12">
                <img class="card-img-top" src="images/sponsor.png" style="width:100%;height:200px">   
                <div class="card-body">
                    <h5 class="card-header">Know about our sponsers</h5>
                    <p class="card-text">
                        To know more about us and our
                        sponsors click below
                    </p>
                </div>
                <button class="btn btn-primary">See More <span style='font-size:15px;'>&#10097;</span></button>
           </div>
         </div>
        <hr>
        <div class="container-fluid fifthContainer">
            <div class="fifthContainer1">
                <h4>
                    Why Choose Us?
                </h4>
            </div>
            <div>
                <h5>CERTIFIED ICU NURSES & ICU DOCTOR</h5>
                <p>
                 With extensive hands on experience, professional certifications and training our specialists ICU Doctors ensure quality care.    
                </p>
            </div>
            <div>
                <h5>BEST IN CLASS ICU DEVICES</h5>
                <p>
                   We offer a wide range of products for all patients needs across an affordable price range. 
                </p>
            </div>
            <div>
                <h5>
                   COST ADVANTAGE 
                </h5>
                <p>
                  Complete expenses of the critical care services come at a fraction of cost of the same services at a hospital.  
                </p>
            </div>
            <div>
                <h5>
                 WORKING WITH THE TREATING PHYSICIAN   
                </h5>
                <p>
                 We involve your own physician in the care plan design and share patient data periodically with him/ her.   
                </p>
            </div>
            <div>
                <h5>
                  CONTINUOUS MONITORING  
                </h5>
                <p>
                    Our trained specialists monitor patient progress and recovery data from our state of the art devices.
                </p>
            </div>
            <div>
                <h5>
                    LOWER RISK OF INFECTION
                </h5>
                <p>
                   Home ICU setups not only save time, money but also substantially reduce the risk of infections for the patient.       
                </p>
            </div>
        </div>
        <hr>
        <div class="row">
        <div class="container sideFifthContainer col-lg-3 col-sm-12 mt-5">
            <h5>FIND US</h5>
            <ul class="list-group">
                <li class="list-group-item">Facebook</li>
                <li class="list-group-item">Google +</li>
                <li class="list-group-item">Twitter</li>
                <li class="list-group-item">Youtube</li>
                <li class="list-group-item">LinkedIn</li>
                <li class="list-group-item">Blog</li>
            </ul>
        </div>
     
        <div class="container-fluid thirdContainer col-lg-6 col-sm-12 mt-5">
                 <h3 class="careHeader">Our Services</h3>
                 <div class="careContanier">
                 <div class="Care">
                     <a href="#"><img src="images/critical care.png"></a>
                     <a href="#"><p>Critical Care</p></a>
                 </div>
                 <div class="Care">
                     <a href="#"><img src="images/elderCare.jpg"></a>
                     <a href="#"><p>Elder Care</p></a>
                 </div>
                 </div>
                 <div class="careContanier">
                 <div class="Care">
                     <a href="#"><img src="images/diabetesCare.png"></a>
                     <a><p>Diabetes</p></a>
                 </div>
                 <div class="Care">
                     <a href="#"><img src="images/physiotherapy.png"></a>
                     <p>Physiotherapy</p>
                 </div>
                 </div>
                 <div class="careContanier">
                 <div class="Care">
                     <a href="#"><img src="images/labtest.png"></a>
                     <p>Lab Test</p>
                 </div>
                 <div class="Care">
                     <a href="#"><img src="images/eye.png"></a>
                     <a href="#"><p>Eye</p></a>
                 </div>
                 </div>
                 <div class="careContanier">
                 <div class="Care">
                     <a href="#"><img src="images/hairCare.jpg"></a>
                     <a href="#"><p>Hair Care</p></a>
                 </div>
                 <div class="Care">
                     <a href="#"><img src="images/bone care.png"></a>
                     <a href="#"><p>Bone Care</p></a>
                 </div>
                 </div>
                 </div>
                <div class="container sideFifthContainer col-lg-3 col-sm-12 mt-5">
                <h5>POPULAR SEARCHES</h5> 
                <ul class="list-group">
                <li class="list-group-item">Physiotherapy for Back Pain</li>
                <li class="list-group-item">Physiotherapy for sports</li>
                <li class="list-group-item">Eldercare for Parents</li>
                <li class="list-group-item">Injections and IVs</li>
                <li class="list-group-item">Cholesterol tests</li>
                <li class="list-group-item">Refer a friend</li>
                </ul>
                </div>
            </div>
        <div class="container-fluid fourthContainer">
            <div class="contactUs">
                <h4>CONTACT US<span>For Bookings and Service queries:</span>
                </h4>
                <p>Ph: 1800 121 23231</p>
                <p>Email:<a href="#">bookings@portea.com</a></p>
            </div>    
            <div class="customerSupport"> 
                <h4>For Customer Support & Feedback:</h4>
                <p>Ph: 1800 121 2323 </p>
                <p>Email:<a href="#">customersupport@portea.com></a></p>
            </div>
            
         </div>
            
    </body>
</html>
