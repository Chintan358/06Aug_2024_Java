<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" >
</head>
<body>
		
		<form:form action="addproduct" method="post" modelAttribute="product">
		
		<%-- <select name="category">
			<c:forEach var="dt" items="${categories}">
			<option value="${dt.getId()}">${dt.getCatname()}</option>
			</c:forEach>
		</select> --%>
		<form:select path="category">
			<form:option value="0" label="   -- Please Select --" />
            <form:options items="${categories}"  itemValue="id" itemLabel="catname"/>
		</form:select>
		
		<br>
		
		<form:label path="pname">Product Name</form:label>
		<form:input path="pname"/>
		
		<br>
		
		<form:label path="price">Product Price</form:label>
		<form:input path="price"/>
		
		<br>
		
		<form:label path="qty">Product Qty</form:label>
		<form:input path="qty"/>
		<br>
		<input type="submit">
		</form:form>
		
		<br>
		<br>
		
		<table border="1">
		
		<tr>
		<th>Id</th>
		<th>Pname</th>
		<th>Price</th>
		<th>Qty</th>
		<th>Category</th>
		</tr>
		
		<c:forEach var="dt" items="${products}">
		
		<tr>
			<td>${dt.getId()}</td>
			<td>${dt.getPname() }</td>
			<td>${dt.getPrice() }</td>
			<td>${dt.getQty() }</td>
			<td>${dt.getCategory().getCatname() }</td>
		</tr>
		
		</c:forEach>
		
		
		</table>
		
		
		
		
</body>
</html>