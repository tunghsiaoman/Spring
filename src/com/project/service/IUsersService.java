package com.project.service;

import java.util.List;
import java.util.Set;

import com.project.model.Users;

public interface IUsersService {
	public List<Object> queryUsersAll();

	// 批量插入
	public void save(int id, String name);

}
