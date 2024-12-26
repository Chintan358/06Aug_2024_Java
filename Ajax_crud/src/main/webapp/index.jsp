<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	
		$(document).ready(function(){
			$("#upbtn").hide()
			load();
		})
		
		function load()
		{
			$.get("display",{},function(rt){
				
				const data = JSON.parse(rt)
				
				var rows=""
				data.map(ele=>{
					rows+="<tr><td>"+ele.id+"</td><td>"+ele.uname+"</td><td>"+ele.email+"</td><td>"+ele.phone+"</td><td><button class='btn btn-danger' onclick='deleteUser("+ele.id+")'>Delete</button></td><td><button class='btn btn-primary' onclick='editUser("+ele.id+")'>Edit</button></td></tr>"
				})
				$("#tdata").html(rows)
			})	
		}
		
		function addUser()
		{
			var uname = $("#uname").val()
			var email = $("#email").val()
			var phone = $("#phone").val()
		
			$.post("addUser",{uname,email,phone},function(rt){
				
				$("#uname").val("")
				$("#email").val("")
				$("#phone").val("")
			
				alert(rt)
				load()
				
			})
		}
		
		function updateUser()
		{
			var uid = $("#uid").val()
			var uname = $("#uname").val()
			var email = $("#email").val()
			var phone = $("#phone").val()
		
			$.post("updateUser",{uid,uname,email,phone},function(rt){
				
				$("#uid").val("")
				$("#uname").val("")
				$("#email").val("")
				$("#phone").val("")
			
				alert(rt)
				load()
				
			})
		}
	
		function deleteUser(uid)
		{
			$.get("update",{uid,"action":"delete"},function(rt){
				alert(rt)
				load()
			})
		}
		
		function editUser(uid)
		{
			$.get("update",{uid,"action":"edit"},function(rt){
				
				const data = JSON.parse(rt)
				$("#uid").val(data.id)
				$("#uname").val(data.uname)
				$("#email").val(data.email)
				$("#phone").val(data.phone)
				
					$("#upbtn").show()
						$("#smbtn").hide()
			})	
		}
		
		function searchUser(value)
		{
				$.get("search",{value},function(rt){
				
				const data = JSON.parse(rt)
				
				var rows=""
				data.map(ele=>{
					rows+="<tr><td>"+ele.id+"</td><td>"+ele.uname+"</td><td>"+ele.email+"</td><td>"+ele.phone+"</td><td><button class='btn btn-danger' onclick='deleteUser("+ele.id+")'>Delete</button></td><td><button class='btn btn-primary' onclick='editUser("+ele.id+")'>Edit</button></td></tr>"
				})
				$("#tdata").html(rows)
			})	
		}
	
	
	</script>

</head>
<body>
	<div class="container">

		<div class="row">

			<div class="col-4 card p-5 mt-2">
				<h1>User Registration</h1>
				<hr>
				<input type="hidden" id="uid">
				<div class="form-group">
					<label>Username</label> <input type="text" id="uname"
						class="form-control">
				</div>
				<div class="form-group">
					<label>Email</label> <input type="text" id="email"
						class="form-control">
				</div>
				<div class="form-group">
					<label>Phone</label> <input type="text" id="phone"
						class="form-control">
				</div>
				<div class="form-group">
					<button class="btn btn-success" id="smbtn" onclick="addUser()">Submit</button>
					<button class="btn btn-success" id="upbtn" onclick="updateUser()">Update</button>
				
				</div>
			</div>
			<div class="col-1"></div>
			<div class="col-7 card p-5 mt-2">
				<h1>User Details</h1>
				<hr>
				<input type="text" placeholder="Search...." class="form-control" onkeyup="searchUser(value)">
				<br>
				<table  class="table">
					<thead>
						<tr>
							<th>Id</th>
							<th>Username</th>
							<th>Email</th>
							<th>Phone</th>
							<th colspan="2">Action</th>
						</tr>
					</thead>
					<tbody id="tdata">

					</tbody>
				</table>
			</div>

		</div>
	</div>


</body>
</html>