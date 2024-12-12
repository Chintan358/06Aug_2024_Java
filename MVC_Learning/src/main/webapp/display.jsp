<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
   
</head>
<body>
		
		<div class="container">
			<div class="row">
				<div class="col-8 mx-auto card p-3 mt-3">

				
			<h1 align="center">Student Details</h1>
			<hr>
	<table class="table">
	<tr>
	<th>Id</th>
	<th>Username</th>
	<th>Email</th>
	<th colspan="2">Action</th>
	</tr>
	
	
	
			<%
			
				String email = (String)session.getAttribute("email");
				if(email==null)
				{
					request.setAttribute("err", "Please login first !!!");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			
			  ArrayList<Student> al = (ArrayList) request.getAttribute("data");
				for(Student s : al)
				{ %>
					<tr>
					<td><%=s.getId() %></td>
					<td><%=s.getUname() %></td>
					<td><%=s.getEmail() %></td>
					<td><a href="update?uid=<%=s.getId()%>&action=update" class="btn btn-primary">Update</a></td>
					<td><a href="update?uid=<%=s.getId()%>&action=delete" class="btn btn-danger">Delete</a></td>
					</tr>
				<%}
			%>
			
	</table>
	<a href="logout" class="btn btn-primary">LOGOUT</a>
	
	</div>
			</div>
		</div>
</body>
</html>