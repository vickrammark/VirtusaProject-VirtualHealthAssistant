<%-- 
    Document   : SignUp
    Created on : Jun 12, 2020, 11:13:13 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            #warningFIRST_NAME
            {
                display: none;
                border: 1px solid red;
                font-size:20px;
            }
            #warningEMAIL
            {
                display: none;
                border: 1px solid red;
                font-size:20px;
            }
            
         </style>
                 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> 
    </head>
    <body>
        <form id="fname" method="POST" action="signUpSetter">
            <div>
                <label for="FIRST_NAME"></label> <input type="text" id="FIRST_NAME" placeholder="Name" name="Name">
            <span id="warningFIRST_NAME"></span>
            </div>
            <div>
                <label for="EMAIL"></label> <input type="email" id="EMAIL" placeholder="Email" name="Email">
                <span id="warningEMAIL"></span>
            </div>
            <div>
                <label for="PASSWRD"></label> <input type="password" id="PASSWRD" placeholder="Password" name="Password">
            </div>
            <input type="submit" id="submit" value="submit">
        </form>
        <script>
        
            $('input').change(function(){
                var currentId=$(this).attr('id');
                var dataId=$('#'+currentId).val();
                if(dataId.length==0)
               {
                       $("#warning"+currentId).css("display","inline");
                       $("#warning"+currentId).html("please fill this field");
               }
               else if(currentId!='PASSWRD')
               {
                   $.ajax({
                       type:'POST',
                       url:'SignUpDetails',
                       data:{
                           userData:dataId,
                           currentIdName:currentId
                       },
                       
                       success: function (data, textStatus, jqXHR) {
                        $("#warning"+currentId).css("display","inline");
                       $("#warning"+currentId).html(data);
                    }
                           
                    });
               }
              
            });
        </script>
    </body>
</html>
