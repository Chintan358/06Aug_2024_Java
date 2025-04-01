package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="uname")
	String uname;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
	
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	List<Blog> blogs;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	List<Reviews> reviews;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
	
	
	
	
}
