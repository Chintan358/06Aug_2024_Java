package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cart;


public interface CartRepo extends JpaRepository<Cart, Integer> {

}
