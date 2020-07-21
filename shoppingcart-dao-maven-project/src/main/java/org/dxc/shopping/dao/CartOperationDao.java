package org.dxc.shopping.dao;

import org.dxc.shopping.model.Product;

public interface CartOperationDao {
	public boolean registerProduct(Product product);
	public boolean removeProduct(Product product);

}
