package com.ssm.smsc.domain;

import java.io.Serializable;


public class Product implements Serializable{
	Integer product_no;
	String name;
	String desc;
	int number;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(Integer product_no, String name, String desc, int number) {
		super();
		this.product_no = product_no;
		this.name = name;
		this.desc = desc;
		this.number = number;
	}


	public Integer getProduct_no() {
		return product_no;
	}


	public void setProduct_no(Integer product_no) {
		this.product_no = product_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", name=" + name
				+ ", desc=" + desc + ", number=" + number + "]";
	}

	
	
	
	
	

}
