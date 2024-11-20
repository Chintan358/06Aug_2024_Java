package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddEmp {
	public static void main(String[] args) {
		
		Connection cn  =null;
		
		try {
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
			
			int i =   st.executeUpdate("insert into emp(id,name,email) values(0,'test','test@gmail.com')");
			
			if(i>0)
			{
				System.out.println("Data inserted...");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
