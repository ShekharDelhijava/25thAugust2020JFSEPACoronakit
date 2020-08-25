package com.eCoronaCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eCoronaCart.model.Product;
import com.eCoronaCart.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/productList/all")
	public String getProducts(Model model) {

		return null;
	}

	@RequestMapping("/viewProduct/{id}")
	public String viewProduct(@PathVariable(value = "id") int id, Model model) {

		return null;

	}

	@RequestMapping("/productList")
	public String getProductByCategory(@RequestParam("searchCondition") String searchCondition, Model model) {

		return null;
	}

}
