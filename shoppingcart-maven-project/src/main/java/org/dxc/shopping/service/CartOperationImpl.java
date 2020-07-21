package org.dxc.shopping.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dxc.shopping.exception.ProductException;
import org.dxc.shopping.model.Product;

public class CartOperationImpl implements CartOperation{
	private float tax_percentage;
	
	private float invoiceAmount;
	
	// container
	List<Product> cart=new ArrayList<Product>();
	
	public CartOperationImpl(float tax_percentage) {
		this.tax_percentage=tax_percentage;
	}
	
	public float getInvoiceAmount() {
		// TODO Auto-generated method stub
		return invoiceAmount;
	}
	public int getProductContainerSize() {
		return cart.size();
	}
	

	public void removeFromCart(Product p) throws ProductException {
		Iterator<Product> iterator=cart.iterator();
		try {
		if(cart.isEmpty())
			throw new ProductException(p.getName());
		}catch(ProductException e) {
			e.printStackTrace();
			System.out.println("ProductException:"+e);
			//System.out.println("ProductException:"+e.getMessage());
		}
		while(iterator.hasNext()){
			if(iterator.next().getName().equals(p.getName())) {
				float tax=(p.getPrice()*p.getQuantity())*tax_percentage/100;
				invoiceAmount-=p.getPrice()*p.getQuantity()+tax;	
				iterator.remove();
			}
			
		} 
		
	}
	
	public float addToCart(Product p) {
		float tax=(p.getPrice()*p.getQuantity())*tax_percentage/100;
		invoiceAmount+=p.getPrice()*p.getQuantity()+tax;
		
		cart.add(p);
		return invoiceAmount;
	}

	@Override
	public String toString() {
		return cart.toString();
	}

	
	
	
	
	
}
