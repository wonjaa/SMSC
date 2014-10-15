package com.ssm.smsc.domain;

import java.io.Serializable;

public class User implements Serializable {
	
	String id;
	String pw;
	int age;
	String name;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(String id, String pw, int age, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", age=" + age + ", name="
				+ name + "]";
	}
	
	
	

}
