<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>


    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1>Welcome to HOME PAGE.</h1>

	 <%-- <%
		String nameIs = (String)request.getAttribute("name");
		int number = (int)request.getAttribute("num");
		List<String> frnd = (List<String>) request.getAttribute("frients");
 	%>	
	
	
	<h2>Name is- <%=nameIs %></h2>
	<h2>Regd no- <%=number %> </h2>
	<h2>My Friends-
	<% 
		for(String x : frnd){ 
	%>
		 <%= x %>
	<% 
		} 
	 %>
	</h2> --%>
	 
	 

	 
	
	<h2>Name: ${name}</h2>
	<h2>Number: ${num}</h2>
	<h2>Friends: ${frients }</h2>
	<c:forEach  var="item" items="${frients}">
		<h3>${item} </h3>
	</c:forEach> 
	
	

</body>
</html>