package com.ssm.smsc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.smsc.domain.Product;

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;


	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProductData() {
		// TODO Auto-generated method stub
		List<Product> pList =null;
		try{
		pList = this.sessionFactory.getCurrentSession().createQuery("from Product").list();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return pList;
	}

	@Override
	public Product getProductData(Integer product_no) {
		// TODO Auto-generated method stub
		Query query = this.sessionFactory.getCurrentSession().createQuery("from Product where product_no = :product_no");
		query.setParameter("product_no", product_no);
		Product product = (Product) query.list().get(0);

		return product;
	}

	@Override
	public void updateProductData(Product product) {
		
		this.sessionFactory.getCurrentSession().update("Product",product);
	}

	@Override
	public void insertProductData(Product product) {
		this.sessionFactory.getCurrentSession().save("Product",product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int getTotalProductNum() {
		String hql = "SELECT count(p) FROM Product p";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		List results = query.list();
		return Integer.parseInt(results.get(0).toString());
		
	}

	@Override
	public void deleteProductData(Integer product_no) {
		Product product = new Product();
		product.setProduct_no(product_no);
		this.sessionFactory.getCurrentSession().delete("Product",product);
		
	}

}
