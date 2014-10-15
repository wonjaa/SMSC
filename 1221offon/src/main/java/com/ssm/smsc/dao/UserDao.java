package com.ssm.smsc.dao;

import java.util.List;

import com.ssm.smsc.domain.User;


public interface UserDao{
	
	public abstract void insertUserData(User user);

	public abstract boolean checkUserData(User user);

	public abstract List<User> selectAllUserData();

}
