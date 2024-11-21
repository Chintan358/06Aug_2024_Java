package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CallableDemo {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
			
			
			CallableStatement cs = con.prepareCall("call new_procedure()");
			
//			ResultSet rs =  cs.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1));
//			}
			
			boolean b =  cs.execute();
			System.out.println(b);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
