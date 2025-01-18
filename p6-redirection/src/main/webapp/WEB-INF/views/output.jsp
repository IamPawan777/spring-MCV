<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Data</title>
</head>
<body>

	<h1>${Header }</h1>

	<h3>${desc }</h3>
	
	<h2>Username is: ${user.username }</h2>
	<h2>Email is: ${user.email }</h2>
	<h2>password is: ${user.password }</h2>

</body>
</html>