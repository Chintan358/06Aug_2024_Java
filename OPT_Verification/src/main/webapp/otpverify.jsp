<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<span>${err}</span>
		<form action="otpverify" method="post">
		<input name="otp" placeholder="Enter your otp">
		<input type="submit">
		</form>
</body>
</html>