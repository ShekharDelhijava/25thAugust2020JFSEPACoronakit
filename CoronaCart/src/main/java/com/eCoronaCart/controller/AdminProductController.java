package com.eCoronaCart.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.eCoronaCart.model.Product;
import com.eCoronaCart.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminProductController {


	@Autowired
	private ProductService productService;

	@RequestMapping("/product/addProduct")
	public String addProduct(Model model) {
		return null;
	}

	@RequestMapping("/product/editProduct/{id}")
	public String editProduct(@PathVariable(value = "id") int id, Model model) {
		Product product = productService.getProductById(id);

		model.addAttribute("product", product);
		return null;
	}

	@RequestMapping(value = "/product/editProduct", method = RequestMethod.POST)
	public String editProduct(@Valid @ModelAttribute(value = "product") Product product, BindingResult result,
			HttpServletRequest request) {

		return null;
	}

	@RequestMapping("/product/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id, Model model, HttpServletRequest request) {

		return null;
	}

}
