package com.ssm.smsc.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public void insertUserData(User user) {
		// TODO Auto-generated method stub
		System.out.println("USER DAO IN"+user.toString());
		
		getSqlSession().insert("UserDao.insertUserData",user);
	}

	@Override
	public boolean checkUserData(User user) {
		// TODO Auto-generated method stub
		System.out.println("checkUserData IN");
		String id = null;
		boolean check = false;
		try{
		id = getSqlSession().selectOne("UserDao.checkUserData",user);
		System.out.println("id!!:"+id);
		}catch (Exception e){
			check = false;
		}
		if(id.equals(user.getId())){
			check = true;
		}
		return check;
		
	}

	@Override
	public List<User> selectAllUserData() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("UserDao.selectAllUserData");
	}

	

}
