package com.eCoronaCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCoronaCart.dao.ProductDao;
import com.eCoronaCart.model.Product;
import com.eCoronaCart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	public List<Product> getProductList() {
		return null;
	}

	public Product getProductById(int productId) {
		return null;
	}

	public void deleteProduct(Product product) {
		
		
	}

	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}

	public void editProduct(Product product) {
		
	}

}
