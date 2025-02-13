<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix = "form" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="addStudent" method="post" modelAttribute="student">
	<form:hidden path="id"/>
	<form:label path="name">Student name</form:label>
	<form:input path="name"/>
	
	<form:label path="email">Email</form:label>
	<form:input path="email"/>
	
	<input type="submit">
	</form:form>
	
	<h1 align="center">Student Details</h1>
	<table border="1" align="center">
	<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>EMAIL</th>
	<th colspan="2">Action</th>
	</tr>
	<c:forEach items="${students}" var="dt">
	<tr>
	<td>${dt.getId()}</td>
	<td>${dt.getName()}</td>
	<td>${dt.getEmail()}</td>
	<td><a href="delete?did=${dt.getId()}">Delete</a> </td>
	<td><a href="edit?eid=${dt.getId()}">Edit</a> </td>
	</tr>
	</c:forEach>	
	</table>		
</body>
</html>