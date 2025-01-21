package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/ser")
public class Filter1 extends HttpFilter {
	
	String flag=null;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		ServletContext cx =  filterConfig.getServletContext();
		flag =  cx.getInitParameter("restricted");
	}
	
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
//		System.out.println("Filter calling");
//		
//		chain.doFilter(request, response);
//		System.out.println("Filter calling...");
		if(flag.equals("no"))
		{
					chain.doFilter(request, response);
		}
		else
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
}
