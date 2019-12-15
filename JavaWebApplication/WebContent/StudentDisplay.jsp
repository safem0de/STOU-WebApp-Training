<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Display</title>
</head>
<body>
<div align="center">
<h2><c:out value="${Student.image_id}" /></h2>
<img src="data:image/jpg;base64,${Student.base64Image}" width="240" height="300"/>
</div>
</body>
</html>