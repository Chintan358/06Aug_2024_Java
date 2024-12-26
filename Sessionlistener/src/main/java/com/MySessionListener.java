package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
	
		int currentUsr = 0;
		int totalUser = 0;
		@Override
		public void sessionCreated(HttpSessionEvent se) {
			
			currentUsr++;
			totalUser++;
			ServletContext cx = se.getSession().getServletContext();
			cx.setAttribute("cUser", currentUsr+"");
			cx.setAttribute("tUser", totalUser+"");
			
		}
	
		@Override
		public void sessionDestroyed(HttpSessionEvent se) {
			currentUsr--;
			ServletContext cx = se.getSession().getServletContext();
			cx.setAttribute("cUser", currentUsr+"");
		}
	
	
}
