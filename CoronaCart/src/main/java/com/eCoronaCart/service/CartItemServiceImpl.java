package com.eCoronaCart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCoronaCart.dao.CartItemDao;
import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.CartItem;
import com.eCoronaCart.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService{

	@Autowired
	private CartItemDao cartItemDao;
	
	public void addCartItem(CartItem cartItem) {
		
		
	}

	public void removeCartItem(CartItem cartItem) {
		
	}

	public void removeAllCartItems(Cart cart) {
		
	}

	public CartItem getCartItemByProductId(int productId) {
		return null;
	}
	
	

}
