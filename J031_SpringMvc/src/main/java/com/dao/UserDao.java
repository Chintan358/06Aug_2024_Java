package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {

	public void addorUpdateUser(User u);
	public List<User> viewUsers();
	public User userById(int id);
	public void deleteUser(int id);
}
