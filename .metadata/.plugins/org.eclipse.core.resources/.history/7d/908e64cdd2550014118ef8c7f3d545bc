package com.ssm.smsc.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;

public class ProductDaoImpl extends SqlSessionDaoSupport implements ProductDao{

	@Override
	public List<Product> getBoardData() {
		
		return getSqlSession().selectList("ProductDao.getBoardData");
	}

	@Override
	public void insertBoardData(Product board) {
		// TODO Auto-generated method stub
		getSqlSession().insert("ProductDao.insertBoardData",board);
	}

	public int selectBoardCount() {
		
		return getSqlSession().selectOne("ProductDao.selectBoardCount");
	}

	@Override
	public List<Product> getAllProductData() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("ProductDao.getAllProductData");
	}

	@Override
	public Product getProductData(Integer product_no) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("ProductDao.getProductData", product_no);
	}

	@Override
	public void updateProductData(Product product) {
		// TODO Auto-generated method stub
		getSqlSession().update("ProductDao.updateProductData", product);
	}

	@Override
	public void insertProductData(Product product) {
		// TODO Auto-generated method stub
		getSqlSession().insert("ProductDao.insertProductData", product);
	}

	@Override
	public int getTotalProductNum() {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("ProductDao.getTotalProductNum");
	}

	@Override
	public void deleteProductData(Integer product_no) {
		// TODO Auto-generated method stub
		getSqlSession().delete("ProductDao.deleteProductData",product_no);
	}

}
