<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3 class="text-center" >${Header }</h3>
	<p class="text-center">${Desc }</p>
	
	<h2> Welcome, ${user.username}</h2>
	<h3> Your email - ${user.email} </h3>
	<h3> and password - ${user.password}</h3>
	<h4>Check Box - ${user.check }</h4>
	
	
</body>
</html>