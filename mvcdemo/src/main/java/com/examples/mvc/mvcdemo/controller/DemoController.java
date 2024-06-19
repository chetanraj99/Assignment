package com.examples.mvc.mvcdemo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.mvc.mvcdemo.model.Product;

@Controller
@RequestMapping("/ctrl2")
public class DemoController {
	
	@RequestMapping(value="/test")
	public String test1(HttpServletResponse response,
			HttpServletRequest request) throws IOException{
		request.setAttribute("name", "Kishore");
		request.setAttribute("city", "Hyderabad");
		return "test3";
	}
	
	@RequestMapping(value="/test4")
	public ModelAndView test4(HttpServletResponse response) throws IOException{
		List<Product> products = new ArrayList<>();
		products.add(new Product(1001,"Laptop",20,4500));
		products.add(new Product(1002,"mobiles",40,9500));
		products.add(new Product(1003,"chargers",50,450));
		products.add(new Product(1004,"earpods",10,200));
		
		return new ModelAndView("test4","products",products);
	}

}
// localhost:9090/mvcdemo/ctrl2/test4