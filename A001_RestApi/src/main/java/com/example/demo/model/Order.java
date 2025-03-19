package com.example.demo.model;


import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="order1")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderid")
	int orderId;
	
	@Column(name="payment_type")
	String paymentType;
	
	@Column(name="order_date")
	String orderDate;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "user_id")
	User user;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	List<OrderItem> orderItems;
	
	

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

//	public String getPaymentType() {
//		return paymentType;
//	}
//
//	public void setPaymentType(String paymentType) {
//		this.paymentType = paymentType;
//	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
