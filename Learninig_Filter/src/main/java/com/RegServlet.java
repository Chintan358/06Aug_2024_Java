package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpClient;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet  extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		PrintWriter pw  =resp.getWriter();
		pw.write("<h1>"+uname+"</h1>");
		pw.write("<h1>"+email+"</h1>");
		pw.write("<h1>"+pass+"</h1>");
		
	}
}
