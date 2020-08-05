<%-- 
    Document   : LoginPager
    Created on : Jul 24, 2020, 3:21:12 PM
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
  <link rel="stylesheet" href="styles/LoginPager.css"> 
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
        <div class='container-fluid mainContainer col-lg-12 col-sm-12'>
            <div class="card mainContentCard" style="border-radius:0px;">
                <div class="card-body" >
                    <div class="card-title bg-success">
                        Congratulation vickram you have successfully signed in!!
                    </div>
                    <hr>
                    <div class="card-text bg-warning">
                    </div>
                </div>
            </div>
        </div>     
        <script>
             if ( window.history.replaceState ) {
        window.history.replaceState( null, null, window.location.href );
    }
              <%
            HttpSession session1=request.getSession();
            String status=(String)session1.getAttribute("message");
            String Name=(String)session1.getAttribute("name");
           %>
            var status=<%=status%>;
            var name="<%=(Name)%>";
            if(status==="true")
            {
             $(".bg-success").html("Congratulation "+name+" you have successfully signed in!!");
             $(".bg-warning").html("<p>Hey "+name+" enjoy our service!!!</p><br><p>Please Login to book your doctors</p><br> <div><a href='Login.jsp' class='btn btn-primary'>Login</a></div> ");
            }
            else
            {
             $(".bg-success").html("Sorry "+name+" something went wrong!!");
             $(".bg-warning").html("<p>We are working on this!!! please wait...</p><br> <div><a href='Login.jsp' class='btn btn-primary'>Login</a></div>");
            }
        </script>
    </body>
</html>
