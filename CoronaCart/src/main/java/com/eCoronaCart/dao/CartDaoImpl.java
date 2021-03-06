package com.eCoronaCart.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eCoronaCart.dao.CartDao;
import com.eCoronaCart.model.Cart;
import com.eCoronaCart.service.CustomerOrderService;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private CustomerOrderService customerOrderService;

	public Cart getCartById(int cartId) {

		return (Cart) sessionFactory.getCurrentSession().get(Cart.class, cartId);
	}

	public void update(Cart cart) {

	}

	public Cart validate(int cartId) throws IOException {

		return null;
	}

}
