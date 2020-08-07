
    function test()
  {
   var exp1="^[a-zA-Z]*$";
   var exp2="^[0-9]*$";
   
   if(document.fname.uname.value=="")
   {
     alert("Enter the Username");
//     f1.user.focus();
     return false;
   }
   if(document.fname.uname.value.search(exp1)==-1)
   {
     alert("Only Alphabets");
//     f1.user.focus();
     return false;
   }
   if(document.fname.pass.value=="")
   {
     alert("Enter the Password");
//     f1.pass.focus();
     return false;
   }

   if(document.fname.pass.value.search(exp2)==-1)
   {
     alert("Only Numbers");
//     f1.pass.focus();
     return false;
   }
   return true;
  }

