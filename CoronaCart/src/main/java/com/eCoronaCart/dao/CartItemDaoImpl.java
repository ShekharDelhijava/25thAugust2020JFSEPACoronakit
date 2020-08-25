package com.eCoronaCart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eCoronaCart.dao.CartItemDao;
import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.CartItem;

@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao{

	@Autowired
	private SessionFactory sessionFactory;
	
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
