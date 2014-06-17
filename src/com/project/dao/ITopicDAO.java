package com.project.dao;

import java.util.List;

import com.project.model.Topic;

/***
 * 操作帖子相关的DAO
 * @author Administrator
 * @since 2014-06-15
 */
public interface ITopicDAO {
	/*-----------------------query--------------------*/
	/** 查询所有帖子 */
	List<Topic> queryAllTopic();
	
	/** 根据id查询对应帖子 */
	Topic queryTopicById(int tid);
	
	/** 根据帖子id和用户id板块id查询帖子信息*/
	Topic queryTopicByTidUidSid(int tid , int uid , int sid);
	
	/** 根据用户id查询帖子信息 */
	List<Topic> queryTopicByUid(int uid);
	
	/** 根据板块id查询帖子 */
	List<Topic> queryTopicBySid(int sid);
	
	/*-----------------------update--------------------*/
	/** 根据帖子id修改帖子信息 */
	int updateTopicByTid(int tid , Topic topic);
	
	/*-----------------------insert--------------------*/
	/** 新增帖子 */
	int insertTopic(Topic topic);
	
	/*-----------------------delete--------------------*/
	/** 根据id删除帖子 */
	int deleteTopic(int tid);
	
}
