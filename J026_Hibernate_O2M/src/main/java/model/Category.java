package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="catid")
	int catid;
		
	@Column(name="catname")
	String catname;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	List<Product> products;

	
	
	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
