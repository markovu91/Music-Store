package com.ynn.muscirecords.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Cart;
import com.ynn.muscirecords.model.User;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	public List <Cart> findByUser(User user);

}
