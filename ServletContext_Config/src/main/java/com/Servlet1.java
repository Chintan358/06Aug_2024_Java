package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>Servlet 1</h1>");
		
		ServletContext cx  =req.getServletContext();
		String url =  cx.getInitParameter("url");
		pw.write("<h2>URL : "+url+"</h2>");
		cx.setAttribute("name", "Parag");
		
		ServletConfig cf = getServletConfig();
		String path = cf.getInitParameter("path");
		pw.write("<h2>PAth : "+path+"</h2>");
		
		
		Enumeration<String> enm =  cf.getInitParameterNames();
		while(enm.hasMoreElements())
		{
			pw.write(enm.nextElement());
		}
		
		
	}
}
