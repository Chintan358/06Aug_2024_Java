<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-7 card p-3 mt-3 mx-auto">
				<span class="text-success">${success}</span>
				<form action="reg" method="post" enctype="multipart/form-data">
					<input type="hidden" name="id" value="${udata.getId()}">
					<div class="form-group row">
						<label for="uname" class="col-sm-2 col-form-label">Username</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="uname" name="uname">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="inputEmail3"
								name="email">
						</div>
					</div>
					<div class="form-group row">
						<label for="phone" class="col-sm-2 col-form-label">Phone</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="phone" name="phone">
						</div>
					</div>
					<fieldset class="form-group">
						<div class="row">
							<legend class="col-form-label col-sm-2 pt-0">Gender</legend>
							<div class="col-sm-10">
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										id="gridRadios1" value="male" checked> <label
										class="form-check-label" for="gridRadios1"> Male </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										id="gridRadios2" value="female"> <label
										class="form-check-label" for="gridRadios2">Female</label>
								</div>

							</div>
						</div>
					</fieldset>
					<div class="form-group row">
						<div class="col-sm-2">Languages</div>
						<div class="col-sm-10">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" id="gridCheck1"
									value="english" name="lang"> <label
									class="form-check-label" for="gridCheck1"> English</label>
							</div>

							<div class="form-check">
								<input class="form-check-input" type="checkbox" id="gridCheck2"
									value="hindi" name="lang"> <label
									class="form-check-label" for="gridCheck2"> Hindi</label>
							</div>

							<div class="form-check">
								<input class="form-check-input" type="checkbox" id="gridCheck3"
									value="kannad" name="lang"> <label
									class="form-check-label" for="gridCheck3"> kannad</label>
							</div>
						</div>
					</div>

					<div class="form-group row">
						<label for="inputEmail3" class="col-sm-2 col-form-label">Country</label>
						<div class="col-sm-10">
							<select class="form-control" id="country" name="country">
								<option value="#">----SELECT COUNTRY-----</option>
								<option value="india">INDIA</option>
								<option value="us">US</option>
								<option value="uk">UK</option>
								<option value="uae">UAE</option>
							</select>
						</div>
					</div>

					<div class="form-group row">
						<label for="fileUpload" class="col-sm-2 col-form-label">image
							upload:</label>
						<div class="col-sm-10">
							<input type="file" class="form-control" id="fileUpload"
								name="file" required>
						</div>
					</div>
					
					<div class="form-group row">
			<div class="col-sm-10">
				<button type="submit" class="btn btn-primary">SUBMIT</button>
			<a href="display">view Users</a>
			</div>
		</div>
			</div>
		</div>
		
		</form>





	</div>
	</div>

	</div>
</body>
</html>