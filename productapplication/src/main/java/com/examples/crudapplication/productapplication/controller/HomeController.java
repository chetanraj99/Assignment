package com.examples.crudapplication.productapplication.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.crudapplication.productapplication.model.Product;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/add")
	public ModelAndView add(HttpServletResponse response) throws IOException {
		return new ModelAndView("add");
	}
	
	
	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct(@RequestParam("pid") int pid,
			@RequestParam("pname")String pname, @RequestParam("quantity") int quantity,
			@RequestParam("price") double price) throws IOException {
		
		Product product = new Product(pid,pname,quantity,price);
		System.out.println(product);
		// code for database connectivity
		return new ModelAndView("dashboard");
	}
	
	@RequestMapping(value = "/search")
	public ModelAndView  search() throws IOException {
		
		return new ModelAndView("search");
	}
	
	@RequestMapping(value = "/searchProduct")
	public ModelAndView  searchProduct(@RequestParam("pid") int pid) throws IOException {
		// code for searching the product 
		return new ModelAndView("display");
	}
	
	@RequestMapping(value = "/display")
	public ModelAndView addProduct() throws IOException {
		Product product = new Product(1001,"laptop",40,56000);
		List<Product> products = new ArrayList<>();
		products.add(product);
		return new ModelAndView("display","products",products);
	}
	
	
	@RequestMapping(value="/test/{name}")
	public String getName(@PathVariable String name,
			HttpServletRequest request) {
		
		request.setAttribute("name", name);
		return "index1";
		
	}

	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam("lid") String username, 
			@RequestParam("pwd") String password)
			throws IOException {

		if (username.equals("admin") && password.equals("admin"))
			return new ModelAndView("dashboard");
		else
			return new ModelAndView("fail");
	}
}
