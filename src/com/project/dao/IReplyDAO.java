package com.project.dao;

import java.util.List;

import com.project.model.Reply;

/***
 * 跟帖DAO
 * @author Administrator
 *
 */
public interface IReplyDAO {
	/*-----------------------query--------------------*/
	/** 根据用户id查询所有跟帖信息 */
	List<Reply> queryReplyByUid(int uid);
	
}
