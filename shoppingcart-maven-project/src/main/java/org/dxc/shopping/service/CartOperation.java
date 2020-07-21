package org.dxc.shopping.service;

import org.dxc.shopping.exception.ProductException;
import org.dxc.shopping.model.Product;

public interface CartOperation {
	float getInvoiceAmount(); // method declaration or unimplemented method
	
	float addToCart(Product p);
	
	void removeFromCart(Product p)throws ProductException;
	int getProductContainerSize() ;
}
