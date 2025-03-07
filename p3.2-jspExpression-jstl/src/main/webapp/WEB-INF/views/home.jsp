<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is HOME PAGE.....</h1>
	
	<h2>Name: ${name}</h2>
	<h2>${friends }</h2>
	
	<c:forEach var="n" items="${friends}">
		<c:out value="${n }"></c:out>
	</c:forEach> 
	
	
	
	
	<a href="description">View Description</a>

</body>
</html>