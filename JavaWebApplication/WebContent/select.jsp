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

<link rel="stylesheet" type="text/css" href="MasterStyle.css">

<style>

table {
  border-collapse: collapse;
  margin:auto;
}

table, th, td {
  border: 1px solid black;
  text-align:center;
}

</style>

</head>
<body>

<form action="studentServlet" method="get" class="form-style-5">
  Employee: <input type="text" name="uname">
  First name: <input type="text" name="fname"><br>
  Last name: <input type="text" name="lname">
  Age: <input type="password" name="password"><br>
  <input type="submit" value="Add New Employee">
  <input type="reset" value="Clear">
</form>

<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
url = "jdbc:mysql://localhost:3307/mobileshopdb"
user = "user00" password = "user00"/>

<%-- <sql:update dataSource = "${snapshot}" var = "result">
INSERT INTO employee VALUES (104, 2, 'Nuha', 'Ali');
</sql:update> --%>

<%-- <c:set var = "empId" value = "103"/>
<sql:update dataSource = "${snapshot}" var = "count">
DELETE FROM employee WHERE Id = ?
<sql:param value = "${empId}" />
</sql:update> --%>

<%-- <c:set var = "empId" value = "102"/>
<sql:update dataSource = "${snapshot}" var = "count">
UPDATE employee SET last = 'Ali' WHERE id = ?
<sql:param value = "${empId}" />
</sql:update> --%>

<sql:query dataSource = "${snapshot}" var = "result">

SELECT * from employee;
</sql:query>
<table>
<tr>

<th>Employee ID</th>
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