package com.eCoronaCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.Customer;
import com.eCoronaCart.model.CustomerOrder;
import com.eCoronaCart.service.CartService;
import com.eCoronaCart.service.CustomerOrderService;

@Controller
public class OrderController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private CustomerOrderService customerOrderService;
	
	@RequestMapping("/order/{cartId}")
	public String createOrder(@PathVariable("cartId") int cartId){
		
		
		return null;
	}

}
