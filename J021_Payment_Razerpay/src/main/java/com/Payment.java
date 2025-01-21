package com;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/payment")
public class Payment extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		double amt = Double.parseDouble(req.getParameter("amt"));
		
		PrintWriter pw  =resp.getWriter();
		 JSONObject options = new JSONObject();
		    options.put("amount", amt*100); // Note: The amount should be in paise.
		    options.put("currency", "USD");
		    options.put("receipt", "txn_123456");
		    options.put("payment_capture", 1);
		    try {
		    	RazorpayClient client = new RazorpayClient("rzp_test_XEnKo7pxj9tPwP","EkWlTAeuGNHF0iLsd4CwMWdW");
				
				Order order = client.orders.create(options);
				
//				Gson JSON = new Gson();
//				pw.append(JSON.toJson(order));
				
				pw.append(order.toString());
				
			} catch (RazorpayException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		
		
	}
}
