package com;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Regservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		Random r = new Random();
		int otp = r.nextInt(100,999);
		OTPsending.send(email, "OTP verification", "Your OTP for registration is : "+otp);
		OTPsending.sms(otp+"", phone);
		
		
		ServletContext cx = req.getServletContext();
		cx.setAttribute("otp", otp+"");
		
		req.getRequestDispatcher("otpverify.jsp").forward(req, resp);
		
		
	}
}
