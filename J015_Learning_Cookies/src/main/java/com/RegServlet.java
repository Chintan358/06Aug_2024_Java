package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String uname  =req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		
		Cookie ck  =new Cookie("uname", uname);
		ck.setMaxAge(60);
		resp.addCookie(ck);
		
		PrintWriter pw = resp.getWriter();
		pw.append("<a href='home'>home</a>");
		
	}
}
