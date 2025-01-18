<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hi, description</title>
</head>
<body>
	<h2>Fill your description...</h2>
	
	<%
		String name = (String)request.getAttribute("name");
		List<String> cour = (List<String>) request.getAttribute("course");
	%>
	
	<h2>Name: <%= name %></h2>
	<h2>Course: 
		<%
			for(String x: cour){
		%>
			<%= x %>,
		<%
			}
		%>
	</h2>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>