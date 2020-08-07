<jsp:useBean id="obj_formdetails" class="vaobjects.FormDetails" scope="request">
    <jsp:setProperty name="obj_formdetails" param="eid" property="eid"/>
    <jsp:setProperty name="obj_formdetails" param="fname" property="fname"/>
    <jsp:setProperty name="obj_formdetails" param="lname" property="lname"/>
    <jsp:setProperty name="obj_formdetails" param="gender" property="gender"/>
    <jsp:setProperty name="obj_formdetails" param="dob" property="dob"/>
    <jsp:setProperty name="obj_formdetails" param="passwrd" property="passwrd"/>
    <jsp:setProperty name="obj_formdetails" param="email" property="email"/>
    <jsp:setProperty name="obj_formdetails" param="mobile" property="mobile"/>
    <jsp:setProperty name="obj_formdetails" param="city" property="city"/>
    <jsp:setProperty name="obj_formdetails" param="state" property="state"/>
</jsp:useBean>

<jsp:forward page="/StoreDetails.jsp"/>