package com.ssm.smsc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.smsc.dao.ProductDao;
import com.ssm.smsc.dao.UserDao;
import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;

@Service("smscService")
public class SmscServiceImpl implements SmscService {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	UserDao userDao;
	
	

	

	@Override
	@Transactional
	public void insertUserData(User user) {
		// TODO Auto-generated method stub
		System.out.println("IN SERVICE");
		userDao.insertUserData(user);
	}

	@Override
	@Transactional
	public boolean checkUserData(User user) {
		// TODO Auto-generated method stub
		boolean check = userDao.checkUserData(user);
		
		return check;
	}


	@Override
	@Transactional
	public List<Product> getAllProductData() {
		// TODO Auto-generated method stub
		return productDao.getAllProductData();
	}

	@Override
	@Transactional
	public Product getProductData(Integer product_no) {
		// TODO Auto-generated method stub
		return productDao.getProductData(product_no);
	}

	@Override
	@Transactional
	public void updateProductData(Product product) {
		// TODO Auto-generated method stub
		productDao.updateProductData(product);
	}

	@Override
	@Transactional
	public void insertProductData(Product product) {
		// TODO Auto-generated method stub
		productDao.insertProductData(product);
	}

	@Override
	@Transactional
	public int getTotalProductNum() {
		// TODO Auto-generated method stub
		return productDao.getTotalProductNum();
	}

	@Override
	@Transactional
	public void deleteProductData(Integer product_no) {
		// TODO Auto-generated method stub
		productDao.deleteProductData(product_no);
	}

}
