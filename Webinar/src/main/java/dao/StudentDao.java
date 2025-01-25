package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDao {
	
	Connection cn  =null;
	public StudentDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn  =DriverManager.getConnection("jdbc:mysql://localhost:3306/webinar","root","root");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public int addStudent(Student std)
	{
		int i=0;
		try {
			PreparedStatement ps  =cn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, std.getName());
			ps.setString(3, std.getEmail());
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}


	public List<Student> viewAllStudents() {
		
		List<Student> al = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from student");
		
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				
				al.add(s);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;
	}
	
}
