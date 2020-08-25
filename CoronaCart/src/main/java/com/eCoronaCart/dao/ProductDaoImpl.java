package com.eCoronaCart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eCoronaCart.dao.ProductDao;
import com.eCoronaCart.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Product> getProductList() {
		return null;
	}

	public Product getProductById(int productId) {
		return null;
	}

	@Transactional
	public void deleteProduct(Product product) {

	}

	@Transactional
	public void addProduct(Product product) {

	}

	public void editProduct(Product product) {

	}

}
