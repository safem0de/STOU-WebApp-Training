<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login</title>
</head>
<body>

<form action="loginServlet" method="post">
<table>

<tr>
<td>Username :</td>
<td><input type="text" name="username"></td>
</tr>

<tr>
<td>Password :</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td><input type="submit" value="Login"></td>
<td></td>
</tr>

</table>
</form>

<a href="index.html">Back</a>
<a href="Profile.jsp">Profile</a>
</body>
</html>