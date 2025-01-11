package com;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/otpverify")
public class OtpVerify  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String otp  =req.getParameter("otp");
		
		ServletContext cx = req.getServletContext();
		String r_otp =  (String) cx.getAttribute("otp");
		
//		System.out.println("Entered otp : "+otp);
//		System.out.println("Generated otp : "+r_otp);
		
		if(otp.equals(r_otp))
		{
			req.getRequestDispatcher("home.jsp").forward(req, resp);
			
		}
		else
		{
			req.setAttribute("err", "Invalid OTP");
			req.getRequestDispatcher("otpverify.jsp").forward(req, resp);
		}
	}
}	
