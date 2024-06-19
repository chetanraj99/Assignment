package com.project.crud.service;

import java.util.List;

import com.project.crud.model.Products;

public interface ProductsService {
	
	public Products searchProduct(int pid);
	public List<Products> displayProducts();
	public boolean addProduct(Products product);

}
