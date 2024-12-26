<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<script type="text/javascript">
	
		$(document).ready(function(){
			
			$.get("countries",{},function(rt){
				$("#country").html(rt)
			})
			
		})
		
		function getState(cid){
			
			$.get("states",{cid},function(rt){
				$("#state").html(rt)
			})
		}
		
		function getCity(sid){
			
			$.get("cities",{sid},function(rt){
				$("#city").html(rt)
			})
		}
	
</script>
</head>
<body>




<select id="country" onchange="getState(value)">
<option>----select country-----</option>
</select>

<select id="state" onchange="getCity(value)">
<option>----select State-----</option>
</select>


<select id="city">
<option>----select City-----</option>
</select>

</body>
</html>