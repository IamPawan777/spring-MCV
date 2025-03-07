<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
<title>Home...</title>
</head>
<body>

	<div class="container text-center p-5">
		<h1>Uploaded Image</h1>
		<form action="uploadimage" method="POST" enctype="multipart/form-data" >
			<div class="mb-3">
				<label id="label-1">Choose Image :</label> 
				<input type="file"	name="images" class="form-control" required>
			</div>

			<button class="btn btn-outline-success">Upload</button>
		</form>
	</div>

</body>
</html>