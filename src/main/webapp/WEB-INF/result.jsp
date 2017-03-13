<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lucky numbers</title>
</head>
<body>
Hello ${lucky.name}, <br>
<ul>
	<c:forEach var="item" items="${lucky.numbers}">
		<li>${item}</li>
	</c:forEach>
</ul>
</body>
</html>