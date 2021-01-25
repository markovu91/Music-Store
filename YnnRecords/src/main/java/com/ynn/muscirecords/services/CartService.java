package com.ynn.muscirecords.services;

import java.util.List;

import com.ynn.muscirecords.model.Cart;
import com.ynn.muscirecords.model.User;

public interface CartService {

	List<Cart>listCartItemsByUser(User user);
}
