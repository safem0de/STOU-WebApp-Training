<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>

<form action="signupServlet" method="post">
<table>

<tr>
<td>ID :</td>
<td><input type="text" name="cust_id"></td>
</tr>

<tr>
<td>Name :</td>
<td><input type="text" name="cust_name"></td>
</tr>

<tr>
<td>Username :</td>
<td><input type="text" name="cus_uname"></td>
</tr>

<tr>
<td>Password :</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td><input type="submit" value="Register"></td>
<td></td>
</tr>

</table>
</form>

</body>
</html>