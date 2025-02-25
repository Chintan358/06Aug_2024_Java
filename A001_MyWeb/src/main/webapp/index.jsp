<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-5 mx-auto card p-5 mt-5">
				<h1>Registration Form</h1>
				<hr>
				<span class="text-success">${msg}</span>
				<form action="reg" method="post">
					
					<div class="form-group">
					<label>Username</label>
					 <input type="text" name="name" class="form-control"> 
					 </div>
					 
					 <div class="form-group">
					<label>Email</label>
					<input type="text" name="email" class="form-control"> 
					</div>
					<br>
					<input type="submit" class="btn btn-success">
				</form>
			</div>
		</div>
	</div>
</body>
</html>