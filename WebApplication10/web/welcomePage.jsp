<%-- 
    Document   : welcomePage
    Created on : Jun 12, 2020, 11:06:56 AM
    Author     : DELL
--%>

<%@page import="intialValues.DataValues"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
    </head>
    <body>
        <h1>Please fill the details</h1>
        <div id="success" class="alert alert-dismissible" style="display:none"><button class="close" data-dismiss="alert"><span>&time;</span>></button></div>
        <table>
            <tr>
                <td>First Name : </td>
                <td><input name="FIRST_NAME" id="FIRST_NAME" type="text" placeholder="Frist Name" readonly></td>
            </tr>
            <tr>
                <td>Last Name : </td>
                <td><input name="LAST_NAME" id="LAST_NAME" type="text" placeholder="Last Name" ></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td><input name="GENDER" id="GENDER" type="text" placeholder="Gender" ></td>
            </tr>
            <tr>
                <td>DOB: </td>
                <td><input name="DOB" id="DOB" type="text" placeholder="Date of Birth" ></td>
            </tr>
            <tr>
                <td>Password : </td>
                <td> <input name="PASSWRD" id="PASSWRD" type="password" placeholder="Password" readonly></td>
            </tr>
            <tr>
                <td>Email : </td>
                <td><input name="EMAIL" id="EMAIL" type="text" placeholder="Email" readonly></td>
            </tr>
            <tr>
                <td>Mobile : </td>
                <td><input name="MOBILE" id="MOBILE" type="text" placeholder="Mobile Number" ></td>
            </tr>
            <tr>
                <td>City : </td>
                <td><input name="CITY" id="CITY" type="text" placeholder="City" ></td>
            </tr>
            <tr>
                <td> State: </td>
                <td><input name="STATE" id="STATE" type="text" placeholder="State"></td>
            </tr>   
            <tr><button class="btn btn-primary" id="save"> Save </button> </tr>
        </table>

        <script>
            <%
                DataValues data=(DataValues)session.getAttribute("totalDetail");
            %>
            $(document).ready(function(){
               var data1='<%= data.getFIRST_NAME() %>';
               var data2='<%= data.getPASSWRD()%>';
               var data3='<%= data.getEMAIL()%>';
               $("#FIRST_NAME").val(data1);
               $("#PASSWRD").val(data2);
               $("#EMAIL").val(data3);
                    
               $("#save").on('click',function(){
                    var data1=$("#LAST_NAME").val();
                    var data2=$("#GENDER").val();
                    var data3=$("#DOB").val();
                    var data4=$("#MOBILE").val();
                    var data5=$("#CITY").val();
                    var data6=$("#STATE").val();
                    var data7=$("#FIRST_NAME").val();
                    
                     $.ajax({
                        type:"POST",
                        url:"remainDetailsLoad",
                        data:{
                            data1:data1,                                                        data1:data1,
                            data2:data2,
                            data3:data3,
                            data4:data4,
                            data5:data5,
                            data6:data6,
                            data7:data7,
                        },
                        success: function (data, textStatus, jqXHR) {
                                $("#success").css("display","block");
                                $("#success").html(data);
                        }
                     });   
               });
             });
                    
        </script>
    </body>
</html>
