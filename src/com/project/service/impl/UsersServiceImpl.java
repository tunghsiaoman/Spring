package com.project.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.IUsersDAO;
import com.project.model.Users;
import com.project.service.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService {
	
	@Autowired
	private IUsersDAO userDao;

	@Override
	public List<Object> queryUsersAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(int id, String name) {
		// TODO Auto-generated method stub
		
	}

}
