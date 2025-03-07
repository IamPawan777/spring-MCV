<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ page isELIgnored="false" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uploaded</title>
</head>
<body>
	
	<h1>${msg }</h1>
	
	<img  width="400px" height="400px" alt="profile image"  src="<c:url value="/resources/image/${filename }" />" >
	
</body>
</html>



