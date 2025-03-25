package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ContactDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.Contact;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public List<UserDto> allUSers() {
		
		List<User> user = repo.findAll();
		List<UserDto> dtos = new ArrayList<UserDto>();
		List<ContactDto> cdtos = new ArrayList<ContactDto>();
		for(User u : user)
		{
			UserDto dto = new UserDto();
			dto.setUserId(u.getUserId());
			dto.setFirstName(u.getFirstName());
			dto.setLastName(u.getLastName());
			dto.setAddress(u.getAddress());
			for(Contact c : u.getContacts())
			{
				ContactDto dt = new ContactDto();
				dt.setContactId(c.getContactId());
				dt.setEmail(c.getEmail());
				dt.setPhone(c.getPhone());
				
				cdtos.add(dt);
			}
			dto.setContacts(cdtos);
			
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public UserDto addOrUpdateUSer(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto userById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
