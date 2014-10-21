package com.ssm.smsc.domain;

import java.io.Serializable;

public class Type implements Serializable {
	
	int id;
	String name;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + "]";
	}
	
	

}
