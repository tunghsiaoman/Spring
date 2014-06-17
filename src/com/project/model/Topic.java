package com.project.model;

import java.io.Serializable;

/**
 * 帖子表
 * @author Administrator
 * @since 2014-06-14
 */
public class Topic implements Serializable {

	private static final long serialVersionUID = 8406582988542432542L;
	
	/** 帖子id */ 
	private int tid;
	/** 板块id */ 
	private int tsid;
	/** 用户id */ 
	private int tuid;
	/** 回复数 */ 
	private int trepaycount;
	/** 发帖表情 */ 
	private int face;
	/** 帖子标题 */ 
	private String topic;
	/** 帖子内容 */ 
	private String contents;
	/** 点击次数 */ 
	private int clickcount;
	/** 状态 */
	private int status;
	/** 最后回复时间 */
	private String lastrepay;
	/** 发帖时间 */
	private String topicdate;
	
	public Topic() {
		super();
	}
	public Topic(int tid, int tsid, int tuid, int trepaycount, int face,
			String topic, String contents, int clickcount, int status,
			String lastrepay, String topicdate) {
		super();
		this.tid = tid;
		this.tsid = tsid;
		this.tuid = tuid;
		this.trepaycount = trepaycount;
		this.face = face;
		this.topic = topic;
		this.contents = contents;
		this.clickcount = clickcount;
		this.status = status;
		this.lastrepay = lastrepay;
		this.topicdate = topicdate;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getTsid() {
		return tsid;
	}
	public void setTsid(int tsid) {
		this.tsid = tsid;
	}
	public int getTuid() {
		return tuid;
	}
	public void setTuid(int tuid) {
		this.tuid = tuid;
	}
	public int getTrepaycount() {
		return trepaycount;
	}
	public void setTrepaycount(int trepaycount) {
		this.trepaycount = trepaycount;
	}
	public int getFace() {
		return face;
	}
	public void setFace(int face) {
		this.face = face;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getClickcount() {
		return clickcount;
	}
	public void setClickcount(int clickcount) {
		this.clickcount = clickcount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getLastrepay() {
		return lastrepay;
	}
	public void setLastrepay(String lastrepay) {
		this.lastrepay = lastrepay;
	}
	public String getTopicdate() {
		return topicdate;
	}
	public void setTopicdate(String topicdate) {
		this.topicdate = topicdate;
	}

}
