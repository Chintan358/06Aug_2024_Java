package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
		
		public void addorUpdateUser(User u);
		public List<User> viewAllUsers();
		public User UserById(int id);
		public void deleteUser(int id);
	
}
