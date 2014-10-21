package com.ssm.smsc.service;

import java.util.List;

import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;

public interface SmscService {
	
	
	public void insertUserData(User user);
	public abstract boolean checkUserData(User user);
	public abstract List<Product> getAllProductData();
	public Product getProductData(Integer product_no);
	public void updateProductData(Product product);
	public void insertProductData(Product product);
	public int getTotalProductNum();
	public void deleteProductData(Integer product_no);

}
