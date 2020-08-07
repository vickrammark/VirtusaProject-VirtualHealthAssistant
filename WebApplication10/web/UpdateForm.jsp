<%-- 
    Document   : UpdateForm
    Created on : Jun 13, 2020, 10:48:50 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 

      </head>
   
    <body>
        <form>
             <div id="EID">
                 
             </div>
             <div>
             <label for="FIRST_NAME">First Name</label><input name="FIRST_NAME" id="FIRST_NAME" placeholder="Employee First Name" type="text" required>
             </div>
             <div>
             <label for="LAST_NAME">Last Name</label><input name="LAST_NAME" id="LAST_NAME" placeholder="Employee Last Name" type="text" required>
             </div>
             <div>
             <label for="GENDER">Gender</label><input name="GENDER" id="GENDER" placeholder="Employee Gender" type="text" required>
             </div>
             <div>
                  <label for="DOB">DOB</label><input name="DOB" id="DOB" placeholder="Employee Date of Birth" type="text" required>
             </div>
             <div> 
                  <label for="PASSWRD">Password</label><input name="PASSWRD " id="PASSWRD" placeholder="Employee password"  type="text" required>
             </div>
              <div>
                  <label for="EMAIL">Email</label><input name="EMAIL" id="EMAIL" placeholder="Employee email"  type="text" required>
             </div>
              <div>
                  <label for="MOBILE">Mobile Number</label><input name="MOBILE" id="MOBILE" placeholder="Employee Mobile Number" type="text"  required>
             </div>
              <div>
                  <label for="CITY">City</label><input name="CITY" id="CITY" placeholder="Employee city" type="text" required>
             </div>
              <div>
                  <label for="STATE">State</label><input name="STATE" id="STATE" placeholder="Employee state" type="text" required>
             </div>
            <div>
                <input type="submit" id="submit" value="submit">
            </div>
            <div>
                <input type="reset" id="reset" value="Reset">
            </div>
        </form>
        <script>
                            $(document).ready(function(){
                               getEMPID(); 
                            
                            });
                            
                            function getEMPID()
                            {
                             $.ajax({
                                 type:"POST",
                                url:"EIDload",
                                success: function (data, textStatus, jqXHR) {
                                    $("#EID").html(data);
                                    
                                 }
                             });
                           }
                           function getdetails()
                           {
                            $.myfunction();   
                           }
                            $.myfunction=function(){
                               var temp=new Array();
                               var data=$("option:selected").attr('value');
                               $.ajax({
                                   type:"POST",
                                  url:"GetPersonalEmployeeDetails",
                                  data:{
                                      userData:data
                                  },
                                  success: function (data, textStatus, jqXHR) {
                                    temp=data.split("||");
                                    $("#FIRST_NAME").val(temp[0]);
                                    $("#LAST_NAME").val(temp[1]);
                                    $("#GENDER").val(temp[2]);
                                    $("#DOB").val(temp[3]);
                                    $("#PASSWRD").val(temp[4]);
                                    $("#EMAIL").val(temp[5]);
                                    $("#MOBILE").val(temp[6]);
                                    $("#CITY").val(temp[7]);
                                    $("#STATE").val(temp[8]);
                                    }
                               });
                           };
                            
                                    
     </script>
   
    </body>
</html>
