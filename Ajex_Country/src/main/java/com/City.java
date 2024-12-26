
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utill.DbConnection;

@WebServlet("/cities")
public class City extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int sid = Integer.parseInt(req.getParameter("sid"));
		PrintWriter pw  =resp.getWriter();
		Connection cn  =DbConnection.getConnection();
		
		Statement st;
		try {
			st = cn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from city where sid="+sid+"");
			String opt="<option>---select city---</option>";
			while(rs.next())
			{
				opt+="<option value='"+rs.getInt(1)+"'>"+rs.getString(2)+"</option>";
			}
			pw.append(opt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
