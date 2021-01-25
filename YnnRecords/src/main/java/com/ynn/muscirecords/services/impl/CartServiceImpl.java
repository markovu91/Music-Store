package com.ynn.muscirecords.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Cart;
import com.ynn.muscirecords.model.User;
import com.ynn.muscirecords.repository.CartRepository;
import com.ynn.muscirecords.services.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	public CartRepository cartRepository;

	@Override
	public List<Cart> listCartItemsByUser(User user) {
		
		return cartRepository.findByUser(user);
	}
	
	
	
	
}
