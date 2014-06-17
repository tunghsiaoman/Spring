package com.project.dao;

import java.util.List;

import com.project.model.Users;

/***
 * 操作用户相关的DAO接口
 * @author Administrator
 * @since 2014-06-14
 */
public interface IUsersDAO {
	/*-----------------------query--------------------*/
	/** 查询所有用户，按照注册时间排序 */
	List<Users> queryAllUsers();
	
	/** 根据id查询用户 */
	Users queryUsersById(int usersId);
	
	/** 根据用户名和密码查询用户 */
	Users queryUsersByUnameAndPwd(String uname, String pwd);
	
	/*-----------------------update--------------------*/
	/** 根据Users对象修改用户 */
	int updateUsers(Users users);
	
	/** 根据用户id修改用户 */
	int updateUsersById(int usersId);
	
	/*-----------------------insert--------------------*/
	/** 新增用户 */
	int insertUsers(Users users);
	
	/*-----------------------delete--------------------*/
	/** 根据id删除用户 */
	int deleteUsers(int usersId);
	
}
