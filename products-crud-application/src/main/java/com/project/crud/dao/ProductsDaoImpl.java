package com.project.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.crud.model.Products;
import com.project.crud.utils.Dbutils;

public class ProductsDaoImpl implements ProductsDao {

	@Override
	public Products searchProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> displayProducts() {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Products> products = new ArrayList<>();
		try {
		con = Dbutils.getDatabaseConnection();
		st = con.createStatement();
		rs = st.executeQuery("select * from products");
		while(rs.next()) {
			products.add(new Products(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getDouble(4)));
		}
		
		}
		catch(Exception e) {
			
		}
		
		return products;
	}

	@Override
	public boolean addProduct(Products product) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		boolean result=false;
		String query = "insert into products values(?,?,?,?)";
		try {
			con=Dbutils.getDatabaseConnection();
			pst=con.prepareStatement(query);
			pst.setInt(1, product.getPid());
			pst.setString(2, product.getPname());
			pst.setInt(3, product.getQuantity());
			pst.setDouble(4, product.getPrice());
			int k = pst.executeUpdate();
			if(k==1)
				result=true;
			else
				result=false;
		}
		catch(Exception e) {
			
		}
		return result;
	}

}
