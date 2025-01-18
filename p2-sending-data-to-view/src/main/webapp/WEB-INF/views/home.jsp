<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is HOME PAGE.....</h1>
	
	
	<%
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
		 <%= x %>, 
	<% 
		} 
	 %>
	</h2>
	
	
	
	
	
	
	
	<a href="description">View Description</a>

</body>
</html>