package com.example.demo.dto;

import java.util.List;

public class UserDto {
		
		int id;
		String username;
		String password;
		List<RoleDto> roles;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public List<RoleDto> getRoles() {
			return roles;
		}
		public void setRoles(List<RoleDto> roles) {
			this.roles = roles;
		}
	
		
		
}
