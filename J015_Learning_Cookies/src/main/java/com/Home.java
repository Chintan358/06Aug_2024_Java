package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		PrintWriter pw  =resp.getWriter();
//		Cookie ck[] = req.getCookies();
//		for(int i=0;i<ck.length;i++)
//		{
//			pw.append("<h2>"+ck[i].getName()+":"+ck[i].getValue()+"</h2>");
//		}
		
		Cookie ck = new Cookie("uname", "");
		ck.setMaxAge(0);
		resp.addCookie(ck);
		
	}
}
