package org.dxc.shopping.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.dxc.shopping.model.Product;
import org.dxc.shopping.util.DBConnection;

public class CartOperationDaoImpl implements CartOperationDao{
	private Connection con;
	private Statement statement;
	public CartOperationDaoImpl(){
	 con=DBConnection.getConnection();
	 }
	
	@Override
	public boolean registerProduct(Product product) {
	   try {
		statement=con.createStatement();
		
	   	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   
		
		return false;
	}

	@Override
	public boolean removeProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
