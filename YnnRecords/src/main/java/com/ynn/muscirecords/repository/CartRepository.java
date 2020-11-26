package com.ynn.muscirecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Cart;

public interface CartRepository extends JpaRepository<Integer, Cart>{
	
	

}
