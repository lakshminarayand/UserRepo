<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script type="text/javascript">

function register()
{
	window.location = "register.jsp";
}
</script>
</head>
<body bgcolor="#e5e3d7">
<div>
<h1 align="center">SWAT TEAM</h1>
<hr>
</div>
<div class="login" align="center">
<h2 style="color:#2a23e0">LOGIN</h2>
<form method="post" action="register.jsp">
<input type="text" name="username" placeholder="username" required="required"/></br></br>
<input type="text" name="password" placeholder="password" required="required"/></br></br>
<button type="button" onclick="" class="btn btn-primary btn-block btn-large">LOGIN</button>&nbsp;
<button type="button" onclick="register()"class="btn btn-primary btn-block btn-large">SIGN UP</button></br></br>
<a href="ForgotPassword.jsp">forgot password</a>

</form>



</div>
</body>
</html>