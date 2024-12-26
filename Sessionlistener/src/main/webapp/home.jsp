<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome , Home</h1>
<a href="logout">Logout</a>

<h1>Current users = <%=application.getAttribute("cUser") %> </h1>
<h1>Total Users = <%=application.getAttribute("tUser") %></h1>

</body>
</html>