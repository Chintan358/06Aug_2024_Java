package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String uname =  req.getParameter("uname");
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			
			
			/*
			 * PrintWriter pw =resp.getWriter(); pw.write("<h1>uname : "+uname+"</h1>");
			 * pw.write("<h1>email : "+email+"</h1>"); pw.write("<h1>pass : "+pass+"</h1>");
			 */
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
				
				String qry = "insert into student values(?,?,?,?)";
				PreparedStatement ps = cn.prepareStatement(qry);
				ps.setInt(1, 0);
				ps.setString(2, uname);
				ps.setString(3, email);
				ps.setString(4, pass);
				
				int i = ps.executeUpdate();
				
				if(i>0)
				{
//					System.out.println("data inserted...");
					resp.setContentType("text/html");
					PrintWriter pw  =resp.getWriter();
					pw.write("<h2>Registration success</h2>");
					req.setAttribute("msg", "Registration success");
					RequestDispatcher rd  =req.getRequestDispatcher("form.jsp");
					//rd.include(req, resp);
					rd.forward(req, resp);
					//resp.sendRedirect("form.jsp");
					
				}
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
}
