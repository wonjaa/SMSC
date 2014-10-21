package com.ssm.smsc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="[user]")
public class User implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	
	
	
	@Id
	@Column(name="id")	
	String id;
	
	@Column(name="pw")
	String pw;
	
	@Column(name="age")
	int age;
	
	@Column(name="name")
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


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getId() {
		return this.id;
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
