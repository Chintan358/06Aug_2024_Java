package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utill.Validation;

@WebFilter("/reg")
public class RegFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
	
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String cpass = req.getParameter("cpass");
		
		RequestDispatcher rd = req.getRequestDispatcher("form.jsp");
		
		if(uname==""||uname==null)
		{
			req.setAttribute("unameErr", "Username required");
			rd.forward(req, resp);
		}
		
		if(email==""||email==null)
		{
			req.setAttribute("emailErr", "Email required");
			rd.forward(req, resp);
		}else if(!Validation.emailValidation(email))
		{
			req.setAttribute("emailErr", "Invalid Email format");
			rd.forward(req, resp);
		}
		
		if(pass==""||pass==null)
		{
			req.setAttribute("passErr", "password required");
			rd.forward(req, resp);
		}
		
		if(!pass.equals(cpass))
		{
			req.setAttribute("cpassErr", "Cpass must same as pass");
			rd.forward(req, resp);
		}
		
		chain.doFilter(req, resp);
		
		
	}
}
