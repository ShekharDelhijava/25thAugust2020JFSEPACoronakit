package com.eCoronaCart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eCoronaCart.dao.CustomerDao;
import com.eCoronaCart.model.Authorities;
import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.Customer;
import com.eCoronaCart.model.Users;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) {
		
	}

	public Customer getCustomerById(int customerId) {
		return null;
	}

	public List<Customer> getAllCustomers() {
		return null;
	}

	public Customer getCustomerByUsername(String username) {
		return null;
	}

}
