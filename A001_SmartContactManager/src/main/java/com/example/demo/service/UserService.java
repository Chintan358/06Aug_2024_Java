package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;

public interface UserService {
	
	public List<UserDto> allUSers();
	public UserDto addOrUpdateUSer(User u);
	public UserDto userById(int id);
	public void deleteUser(int id);
	
}
