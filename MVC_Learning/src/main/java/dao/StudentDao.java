package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;
import utill.DbConnection;

public class StudentDao {
	
		Connection cn = null;
		public StudentDao() {
			cn = DbConnection.getConnection();
		}
	
		public int addStudent(Student st)
		{
			int i=0;
			try {
				PreparedStatement ps  =cn.prepareStatement("insert into student values(?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2, st.getUname());
				ps.setString(3, st.getEmail());
				ps.setString(4, st.getPass());
				
				i = ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return i;
		}
		
		
		public ArrayList<Student> viewallstudents()
		{
			ArrayList<Student> al = new ArrayList();
			
			try {
				PreparedStatement ps  =cn.prepareStatement("select * from student");
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					Student st = new Student();
					st.setId(rs.getInt(1));
					st.setUname(rs.getString(2));
					st.setEmail(rs.getString(3));
					st.setPass(rs.getString(4));
					
					al.add(st);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return al;
			
			
		}

		public int deleteStudent(int uid) {
			// TODO Auto-generated method stub
			int i = 0;
			try {
				PreparedStatement ps = cn.prepareStatement("delete from student where id=?");
				ps.setInt(1, uid);
				
				i = ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return i;
		}

		public Student getStudentById(int uid) {
			
			Student st = new Student();
			try {
				PreparedStatement ps = cn.prepareStatement("select * from student where id=?");
				ps.setInt(1, uid);
				
				ResultSet rs= ps.executeQuery();
				while(rs.next())
				{
					st.setId(rs.getInt(1));
					st.setUname(rs.getString(2));
					st.setEmail(rs.getString(3));
					st.setPass(rs.getString(4));
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return st;
		}

		public int editStudent(Student st) {
			
			int i = 0;
			try {
				PreparedStatement ps = cn.prepareStatement("update student set uname=?,email=?,pass=? where id=?");
				ps.setString(1, st.getUname());
				ps.setString(2, st.getEmail());
				ps.setString(3, st.getPass());
				ps.setInt(4, st.getId());
				
				i = ps.executeUpdate();
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return i;
		}
		
		public boolean isEmailExist(String email)
		{
			boolean b = false;
			
			try {
				PreparedStatement ps  =cn.prepareStatement("select * from student where email=?");
				ps.setString(1, email);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next())
				{
					b = true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return b;
		}

		public Student logincheck(Student st) {
			
			Student std = new Student();
			try {
				PreparedStatement ps  =cn.prepareStatement("select * from student where email=? and pass=?");
				ps.setString(1, st.getEmail());
				ps.setString(2, st.getPass());
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next())
				{
					std.setId(rs.getInt(1));
					std.setUname(rs.getString(2));
					std.setEmail(rs.getString(3));
				}
				else
				{
					std = null;
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return std;
		}
		
		
}
