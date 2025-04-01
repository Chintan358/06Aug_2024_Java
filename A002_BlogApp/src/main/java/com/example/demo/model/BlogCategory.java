package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="blog_Category")
public class BlogCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="category_name")
	String categoryName;
	
	@OneToMany(mappedBy = "blogCategory",cascade = CascadeType.ALL)
	List<Blog> blogs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
	
	
}
