package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String data = req.getParameter("data");
		
		PrintWriter pw = resp.getWriter();
		
		String str = "";
//		if(data.equals("electric"))
//		{
//			str +="<ul><li>Fan</li><li>TV</li><li>AC</li></ul>";
//		}
//		else if(data.equals("cloths"))
//		{
//			str +="<ul><li>Cap</li><li>Shirt</li><li>T-shirt</li></ul>";
//		}
//		else
//		{
//			str+="data not found";
//		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
			
			Statement st = cn.createStatement();
			
			ResultSet rs =  st.executeQuery("select * from product where pname like '"+data+"%'");
			
			str+="<ul>";
			while(rs.next())
			{
				str+="<li>"+rs.getString(2)+"</li>";
			}
			str+="</ul>";
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.append(str);
		
		
	}
}
