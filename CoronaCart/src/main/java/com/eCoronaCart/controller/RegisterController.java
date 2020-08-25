package com.eCoronaCart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eCoronaCart.model.BillingAddress;
import com.eCoronaCart.model.Customer;
import com.eCoronaCart.model.ShippingAddress;
import com.eCoronaCart.service.CustomerService;

@Controller
public class RegisterController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/register")
	public String registerCustomer(Model model){
		
		
		
		return null;
		
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model){
		return null;
		}
		
		
	
}
