function test()
{
    if(document.fname.uname.value=="")
    {
        alert("Enter the name");
        return false;
    }
    if(document.fname.pass.value=="")
    {
        alert("Enter the name");
        return false;
    }
    if(document.fname.pass.value.search("^[a-zA-Z]{0,20}$")==-1)
    {
        alert("Name should only have alphabets");
        return false;    
    }
    if(document.fname.pass.value.search("^[0-9]{0,20}$")==-1)
    {
        alert("Password should only have number");
        return false;    
    }
}