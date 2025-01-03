<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
	<input type="text" name="uname" placeholder="Enter username">
	<input type="file" name="file">
	<input type="submit"> 
	</form>
	<br>
	
	<hr>
	
	<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/java" user="root" password="root" var="dt" />
	<sql:query var="data" dataSource="${dt}">
	select * from upload;
	</sql:query>
	
	<table border="1" align="center" >
	<tr>
	<th>Id</th>
	<th>Username</th>
	<th>Image</th>
	</tr>
	
	<c:forEach items="${data.rows}" var="users">
	<tr>
	<td>${users.id}</td>
	<td>${users.uname}</td>
	<td><img alt="${users.img}" src="img/${users.img}" height="50px" width="50px"> </td>
	</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>