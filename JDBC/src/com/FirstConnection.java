package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstConnection {
	public static void main(String[] args) {
		
		
		Connection cn = null;
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded...");
			
			
			//define the conneciton url
			String url = "jdbc:mysql://localhost:3306/java";
			String user = "root";
			String pass = "root";
			
			// Establish the Connection
			 cn =  DriverManager.getConnection(url,user,pass);
			System.out.println("connection established..");
			
			//create astatment
			Statement st = cn.createStatement();
			
			//execute query
			ResultSet rs =  st.executeQuery("select * from emp");
			
			//precess the result
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				
				System.out.println(id+" "+name+" "+email);
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
