<%-- 
    Document   : index
    Created on : Jun 12, 2020, 12:30:11 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
        <style>
            #warning1
            {
                display: none;
                border: 1px solid red;
                font-size:20px;
                height:100px;
            }
         </style>
    </head>
    <body>
        <span id="warning1"></span>
        <form id="fname"  action="welcomeMainPage.jsp" onsubmit="return currentSatuts()">
            <div>
                <label for="FIRST_NAME"></label> <input type="text" id="FIRST_NAME" placeholder="Name" name="Name" required>
      
            </div>
            <div>
                <label for="EMAIL"></label> <input type="email" id="EMAIL" placeholder="Email" name="Email" required>
                
            </div>
            <div>
                <label for="PASSWRD"></label> <input type="password" id="PASSWRD" placeholder="Password" name="Password" required>
            </div>
            <input type="submit" id="submit" value="submit" >
        </form>
        <a href="SignUp.jsp" class="btn btn-primary">Sign Up</a>

        <script>
            
            $(document).ready(function(){
               var status1=new Array();
               status1.fill("false");
               var i=0;
            $('input:not("#submit")').change(function(event){
                var ID=$(this).attr("id");
                var dataId=$("#"+ID).val();
                  $.ajax({
                      type:'POST',
                      url:'LoginCheckServlet',
                      data:{
                          userData:dataId,
                           currentIdName:ID
                       },                      
                      success: function(responseText) {
                                $("#warning1").css("display","inline");
                                var array1=responseText.split("&");
                                var message=array1[0];
                                 status1[i]=array1[1];
                                 i++;
				$('#warning1').html(message);
			},
                        error: function (jqXHR, textStatus, errorThrown) {
                                    $("#warning1").css("display","inline");
                                    $('#warning1').html(textStatus);
                    }
                    });
                    //pass1001
                    //GD01@gmail.com
                });
              $('form input').keydown(function (e) {
    if (e.keyCode == 13) {
        e.preventDefault();
        return false;
    }
});
                $("#submit").click(function(){
                    var verify="false";
                  for(i=0;i<status1.length;i++)
                     {
                         if(status1[i]=="true")
                         {
                             verify="true";
                         }
                         else
                         {
                             verify="false";
                             break;
                         }
                        
                     }
                  
                   if(verify=="true")
                     {
                          return true;             
                     }
                     else
                     {
                         return false;
                     }
                    });
                 
           
                  
});
            
        </script>
    </body>
</html>
