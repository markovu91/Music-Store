package com.ynn.muscirecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	

}
