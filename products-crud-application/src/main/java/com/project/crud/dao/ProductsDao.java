package com.project.crud.dao;

import java.util.List;

import com.project.crud.model.Products;

public interface ProductsDao {
	
	public Products searchProduct(int pid);
	public List<Products> displayProducts();
	public boolean addProduct(Products product);


}
