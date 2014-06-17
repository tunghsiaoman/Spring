package com.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.dao.IUsersDAO;
import com.project.model.Users;

@Repository
public class UsersDAOImpl implements IUsersDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Users> queryAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users queryUsersById(int usersId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users queryUsersByUnameAndPwd(String uname, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUsers(Users users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUsersById(int usersId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertUsers(Users users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUsers(int usersId) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
