package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public void addorUpdateUser(User u) {
		// TODO Auto-generated method stub
		repo.save(u);
	}

	@Override
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User UserById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
