package com.ynn.muscirecords.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ynn.muscirecords.model.Cart;
import com.ynn.muscirecords.model.User;
import com.ynn.muscirecords.services.CartService;
import com.ynn.muscirecords.services.UserService;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/cart")
	public String showCart(Model model, @AuthenticationPrincipal Authentication authentication) {
		
		User user = userService.getCurrentlyLoggedInUser();
		List<Cart>cartItems=cartService.listCartItemsByUser(user);
		
		model.addAttribute("cartItems", cartItems);
		model.addAttribute("pageTitle", "Shopping Cart");
		
		return "cart";
	}
	
}
