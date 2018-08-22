<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ForgotPassword</title>
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
if((frm.mobile.value).length < 10)
{
alert("number should not be less then 10 digit");
frm.mobile.focus();
return false;
}
return true;
}
</script>
</head>
<body bgcolor="#e5e3d7">
<div align="center">
<h3>FORGOT PASSWORD</h3>
<form name="frm" method="post">
<input type="text" name="mobile" placeholder="mobile"/></br></br></td>

<button type="submit" class="btn btn-primary btn-block btn-large" onclick="return val();">Submit</button>
</form>
</div>
</body>
</html>