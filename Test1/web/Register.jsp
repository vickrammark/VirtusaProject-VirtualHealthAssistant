<%@page  import="java.sql.*;" %>
<html>
    <head>
        <style>
            table
            {
                border: medium solid #660000;
            }
            thead
            {
             font-size:15px;
             font-family: verdana;
             background-color:burlywood;
             font-weight:lighter
            }
            tbody
            {
             background-color:bisque;
             background-color:palegoldenrod;
             font-size: 10px;
             font-family: verdana;
             font-weight: bold
            }
            input
            {
                font-family: Verdana;
                font-size:10px;
                font-style: normal
            }
            select
            {
                font-family: Verdana;
                font-size:10px;
                font-style: normal

            }
        </style>
    </head>

    <body>
        <form action="Process.jsp">
            <table width="30%" cellspacing="2"  align="center" border="0">
                <thead>
                    <tr>
                        <th colspan="3">Registration Form</th>
                    </tr>
                </thead>
                <tbody>

                    <tr>
                        <td>Emp ID</td>
                        <td>:</td>
                        <td><input type="text" name="eid" size="15"></td>
                    </tr>

                    <tr>
                        <td>Firstname</td>
                        <td>:</td>
                        <td><input type="text" name="fname" size="15"></td>
                    </tr>

                    <tr>
                        <td>Lastname</td>
                        <td>:</td>
                        <td><input type="text" name="lname" size="15"></td>
                    </tr>

                    <tr>
                        <td>Gender</td>
                        <td>:</td>
                        <td>
                            <input type="radio" name="gender" value="male" />Male
                            <input type="radio" name="gender" value="female" />Female
                        </td>
                    </tr>

                    <tr>
                        <td>DOB</td>
                        <td>:</td>
                        <td><input type="text" name="dob" size="15"></td>
                    </tr>

                    <tr>
                        <td>Password</td>
                        <td>:</td>
                        <td><input type="password" name="passwrd" size="15"></td>
                    </tr>

                    <tr>
                        <td>E-mail</td>
                        <td>:</td>
                        <td><input type="text" name="email" size="15"></td>
                    </tr>

                    <tr>
                        <td>Mobile</td>
                        <td>:</td>
                        <td><input type="text" name="mobile" size="15"></td>
                    </tr>
                    <tr>
                        <td>City</td>
                        <td>:</td>
                        <td>
                            <select name="city">
                                <option>Select</option>
                                <option value="chennai">Chennai</option>
                                <option value="coimbatore">Coimbatore</option>
                                <option value="erode">Erode</option>
                                <option value="trichy">Trichy</option>
                                <option value="salem">Salem</option>
                                <option value="banglore">Banglore</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>State</td>
                        <td>:</td>
                        <td>
                            <select name="state">
                                <option>Select</option>
                                <option value="tamilnadu">Tamilnadu</option>
                                <option value="karnataka">Karnataka</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit"  value="submit">
                        </td>
                        <td>
                            <input type="reset" value="reset">
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>

