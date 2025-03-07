<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Home Page</title>
</head>
<body>

	<div class="container mt-5" >
	<h3 class="text-center" >${Header }</h3>
	<p class="text-center">${Desc }</p>
	
		<form action="sending" method="post">                               	<!-- go to controller method -->
			<div class="mb-3">
				<label for="exampleInputText" class="form-label">Username</label> 
				<input type="text" class="form-control"	id="exampleInputText" name="username" aria-describedby="emailHelp" placeholder="Enter Username" >
			</div>
			
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email address</label> 
				<input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp"  placeholder="Enter Email">
			</div>
			
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control"	id="exampleInputPassword1" name="password" placeholder="Enter Password">
			</div>
			
			<div class="mb-3 form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me out</label>
			</div>
			
			<div class="container text-center" >
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
			
		</form>
	</div>

	<!-- Optional JavaScript; choose one of the two! -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>