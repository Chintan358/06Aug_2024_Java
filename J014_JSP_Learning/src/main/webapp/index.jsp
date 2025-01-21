<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="true" errorPage="error.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<jsp:include page="header.jsp"></jsp:include>	<!-- ffdsfdsf -->
			<br>
			${msg}
			<%! private int a; %>
			
			<%
				/* Scanner sc = new Scanner(System.in);
				 a = 10;
				for(int i=1;i<=10;i++)
				{
					out.print(i);
				}
				 */
				
				/* int i = 0;
				 int j = 10/i;
				 */
				
				/*  int a[] = new int[10];
				 a[15] = 10;
				 */
			%>
			<%=a%>
</body>
</html>