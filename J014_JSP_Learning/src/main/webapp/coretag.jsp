<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	 <c:set value="10" var="a"></c:set>	
	<c:out value="${a}"></c:out>
	
<%-- 	<c:import var="data" url="https://www.fb.com"/>  
	<c:out value="${data}"/>  
	 --%>
	
	<c:set var="income" scope="session" value="${4000*4}"/>  
	<c:if test="${income > 8000}">  
	   <p>My income is: <c:out value="${income}"/><p>  
	</c:if>	
	
	<c:forEach begin="1" end="10" var="dt">
	<c:out value="${dt}"></c:out>
	</c:forEach>
	
</body>
</html>