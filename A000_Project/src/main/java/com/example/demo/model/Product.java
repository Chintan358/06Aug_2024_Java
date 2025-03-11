package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_qty")
	private int productQty;
	@Column(name="product_price")
	private double produtPrice;
	@Column(name="product_image")
	private String productImage;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="category_id")
	Category category;
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	List<Cart> catrs;
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	List<OrderItem> orderItemes;

	public List<Cart> getCatrs() {
		return catrs;
	}

	public void setCatrs(List<Cart> catrs) {
		this.catrs = catrs;
	}

	public List<OrderItem> getOrderItemes() {
		return orderItemes;
	}

	public void setOrderItemes(List<OrderItem> orderItemes) {
		this.orderItemes = orderItemes;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProdutPrice() {
		return produtPrice;
	}

	public void setProdutPrice(double produtPrice) {
		this.produtPrice = produtPrice;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
}
