 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 
 <!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

	<link rel="stylesheet"  href="<c:url value="/resources/css/style.css" />" >						<!-- CSS resource add -->
	<script src='<c:url value="/resources/js/script.js" ></c:url>' ></script>						<!-- JS resource add -->
	
    <title>Hello, world!</title>
  </head>
  <body >
    
    
		
		
		<div class="container" >
			<div class="text-center">
     			<img  alt="Click Image" src="<c:url value="/resources/images/search.png"  />" width="400px" height="230px">		<!-- jstl for images -->
     		</div> 
			<div class="card mx-auto mt-5 bg-primary" style="width: 60%;">
				<div class="card-body p-5">
					<h3 class="text-center" style="text-decoration: overline; text-transform: uppercase;">Google Search</h3>
					
					<form class="mt-4" action="googleProcess" method="post">
						<div class="form-group">
							<input class="form-control" type="text" name="googleQueryBox" placeholder="Search Here...">
						</div>
						<div class="container text-center mt-4">
							<button class=" btn btn-outline-light">Search</button>
						</div>
					</form>
					
				</div>			
			</div>
		</div>


		

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>