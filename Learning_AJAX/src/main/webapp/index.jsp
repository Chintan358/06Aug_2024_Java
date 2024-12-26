<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

	<script type="text/javascript">
	
	function search(){
		
		const data = $("#data").val()
		
		$.get("myservlet",{data},function(rt){
			$("#s_data").html(rt)
		})
		
		
	}
	
	</script>


</head>
<body>
		<input type="text" id="data" onkeyup="search()">
		<button onclick="search()">Click me</button>
		<div id="s_data"></div>
</body>
</html>