package com.ssm.smsc.dao;

import java.util.List;

import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;

public interface ProductDao {
	

	public abstract List<Product> getAllProductData();

	public abstract Product getProductData(Integer product_no);

	public abstract void updateProductData(Product product);

	public abstract void insertProductData(Product product);

	public abstract int getTotalProductNum();

	public abstract void deleteProductData(Integer product_no);

}
