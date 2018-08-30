<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>details page</title>
</head>
<body bgcolor="orange">
 <center>
<h1>User details</h1>
<p><b>Welcome User:</b></p>
</center>
<table align="center" border="1">
<tr bgcolor="cyan">
<!-- <td><b>name</b></td> -->
<td><b>username</b></td>
<td><b>Email</b></td>
<td><b>mobile</b></td>
</tr>
 <tr>
<td>${user.getUsername()}</td>
<td>${user.getEmail()}</td>
<td>${user.getMobile()}</td>
<%-- <td><%=request.getParameter("mobile") %></td>
<td><%=request.getParameter("email") %></td> --%>
</tr>
</table>
</body>
</html>