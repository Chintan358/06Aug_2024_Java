package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public void addorUpdateUser(User u) {
		
		dao.addorUpdateUser(u);
	}

	@Override
	public List<User> viewUsers() {
		// TODO Auto-generated method stub
		return dao.viewUsers();
	}

	@Override
	public User userById(int id) {
		// TODO Auto-generated method stub
		return dao.userById(id);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		dao.deleteUser(id);
	}

}
