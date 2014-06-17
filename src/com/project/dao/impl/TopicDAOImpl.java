package com.project.dao.impl;

import java.util.List;

import com.project.dao.ITopicDAO;
import com.project.model.Topic;

public class TopicDAOImpl implements ITopicDAO {

	@Override
	public List<Topic> queryAllTopic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic queryTopicById(int tid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic queryTopicByTidUidSid(int tid, int uid, int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> queryTopicByUid(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> queryTopicBySid(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTopicByTid(int tid, Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTopic(int tid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
