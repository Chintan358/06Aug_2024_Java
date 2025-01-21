<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" id="amt" placeholder="enter amount">
	<button id="rzp-button1">Pay with Razorpay</button>
	<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
	<script>

document.getElementById('rzp-button1').onclick = function(e){
  
    e.preventDefault();
    var amt = $("#amt").val()
    $.get("payment",{amt},function(rt){
    	
    	const data = JSON.parse(rt)
    	
    	var options = {
    	    "key": "rzp_test_XEnKo7pxj9tPwP", // Enter the Key ID generated from the Dashboard
    	    "amount": data.amount, // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
    	    "currency": "USD",
    	    "name": "Tops Tech",
    	    "description": "Test Transaction",
    	    "image": "https://example.com/your_logo",
    	    "order_id":data.id, //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
    	    "handler": function (response){
    	        alert(response.razorpay_payment_id);
    	        alert(response.razorpay_order_id);
    	        alert(response.razorpay_signature)
    	    },
    	    "prefill": {
    	        "name": "Gaurav Kumar",
    	        "email": "gaurav.kumar@example.com",
    	        "contact": "9000090000"
    	    },
    	    "notes": {
    	        "address": "Razorpay Corporate Office"
    	    },
    	    "theme": {
    	        "color": "#3399cc"
    	    }
    	};
    	var rzp1 = new Razorpay(options);
    	rzp1.on('payment.failed', function (response){
    	        alert(response.error.code);
    	        alert(response.error.description);
    	        alert(response.error.source);
    	        alert(response.error.step);
    	        alert(response.error.reason);
    	        alert(response.error.metadata.order_id);
    	        alert(response.error.metadata.payment_id);
    	});
    	
    	
    	 rzp1.open();
    })
    
   
    
    
}
</script>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</body>
</html>