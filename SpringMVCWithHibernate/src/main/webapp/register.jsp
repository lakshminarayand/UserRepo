<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION</title>
<script type="text/javascript">
function val()
{
if(frm.mobile.value=="")
{
alert("please enter the phone number");
frm.mobile.focus();
return false;
}
if(isNaN(frm.mobile.value))
{
alert("mobile number should contain only numbers");
frm.mobile.focus();
return false;
}
if((frm.mobile.value).length != 10)
{
alert("number should not be less then 10 digit");
frm.mobile.focus();
return false;
}

var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z])+\.([A-Za-z]{2,4})$/;

if (reg.test(frm.email.value) == false) 
{
    alert('Invalid Email Address');
    return false;
}

return true;
}



</script>
</head>
<body>
<body bgcolor="#e5e3d7">
<div class="login" align="center">
<h2>Register</h2>
<form name="frm" method="post">
<table>
<tr>
<td><input type="text" name="name" placeholder="name" required="required"/></br></br></td>
</tr>
<tr>
<td><input type="text" name="username" placeholder="username" required="required"/></br></br></td>
</tr>
<tr>
<td><input type="text" name="password" placeholder="password" required="required"/></br></br></td>
</tr>
<tr>
<td><input type="text" name="mobile" placeholder="mobile" required="required"/></br></br></td>
</tr>
<tr>
<td><input type="text" name="email" placeholder="email" required="required"/></br></br></td>
</tr>

</table>
<button type="submit" class="btn btn-primary btn-block btn-large" onclick="return val();">SIGN UP</button>

</form>



</div>

</body>
</html>