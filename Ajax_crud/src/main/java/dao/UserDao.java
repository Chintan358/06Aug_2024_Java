package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
import utill.DbConnection;

public class UserDao {
	
	Connection cn  =null;
	public UserDao() {
		// TODO Auto-generated constructor stub
		cn = DbConnection.getConn();
	}
	public ArrayList<User> viewallUsers() {
		
		ArrayList<User> al = new ArrayList();
		
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));
				al.add(u);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;
	}
	public int insertuser(User u) {
		
		int i = 0;
		
		try {
			PreparedStatement ps = cn.prepareStatement("insert into user values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, u.getUname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPhone());
			
			i = ps.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	public int deleteUser(int id) {
		int i=0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from user where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public User userById(int id) {
		
		User u = new User();
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from user where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				u.setId(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}
	public int updateUser(User u) {
		
		
		int i = 0;
		
		try {
			PreparedStatement ps = cn.prepareStatement("update user set username=?,email=?,phone=? where id=?");
			ps.setInt(4, u.getId());
			ps.setString(1, u.getUname());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPhone());
			
			i = ps.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	public ArrayList<User> searchUser(String value) {
		
		ArrayList<User> al = new ArrayList();
		
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from user where username like ?");
			ps.setString(1, value+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));
				al.add(u);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;
		
		
	}
	
	
	
}
