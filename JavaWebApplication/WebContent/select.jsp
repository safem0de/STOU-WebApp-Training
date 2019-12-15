<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select from MySQL</title>
<style>

td{
text-align:center;
}

</style>

</head>
<body>

<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
url = "jdbc:mysql://localhost:3307/mobileshopdb"
user = "user00" password = "user00"/>

<sql:query dataSource = "${snapshot}" var = "result">

SELECT * from employee;
</sql:query>
<table border ="1" width = "100%">
<tr>

<th>Emp ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
</tr>

<c:forEach var = "row" items = "${result.rows}">
<tr>
<td><c:out value = "${row.id}"/></td>
<td><c:out value = "${row.first}"/></td>
<td><c:out value = "${row.last}"/></td>
<td><c:out value = "${row.age}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>