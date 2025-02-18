<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
		
		<h1 align="center">User Registration</h1>
		
		<form:form action="addUser" method="post" modelAttribute="user">
		<form:hidden path="id"/>
		<form:label path="uname">Username</form:label>
		<form:input path="uname"/>
		<form:label path="email">Email</form:label>
		<form:input path="email"/>
		<input type="submit">
		</form:form>
		<br>
		<br>
		<h1 align="center">User Details</h1>
		<table align="center" border="1">
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${users}" var="dt">
		<tr>
		<td>${dt.getId()}</td>
		<td>${dt.getUname()}</td>
		<td>${dt.getEmail()}</td>
		<td><a href="delete?uid=${dt.getId()}">Delete</a></td>
		<td><a href="edit?uid=${dt.getId()}">Edit</a></td>
		</tr>
		</c:forEach>
		</table>
		
</body>
</html>