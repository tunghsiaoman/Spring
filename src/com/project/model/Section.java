package com.project.model;

import java.io.Serializable;

/**
 * 板块bean
 * @author Administrator
 * @since 2014-06-14
 */
public class Section implements Serializable {

	private static final long serialVersionUID = -4239894719012632787L;
	
	/** 板块id */
	private int sid;
	/** 版块儿名称 */
	private String sname;
	/** 版主用户id */
	private int smasterid;
	/** 版块儿简介 */
	private String sprofile;
	/** 点击次数 */
	private int clickcount;
	/** 发帖数 */
	private int topiccount;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmasterid() {
		return smasterid;
	}
	public void setSmasterid(int smasterid) {
		this.smasterid = smasterid;
	}
	public String getSprofile() {
		return sprofile;
	}
	public void setSprofile(String sprofile) {
		this.sprofile = sprofile;
	}
	public int getClickcount() {
		return clickcount;
	}
	public void setClickcount(int clickcount) {
		this.clickcount = clickcount;
	}
	public int getTopiccount() {
		return topiccount;
	}
	public void setTopiccount(int topiccount) {
		this.topiccount = topiccount;
	}
	public Section(int sid, String sname, int smasterid, String sprofile,
			int clickcount, int topiccount) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smasterid = smasterid;
		this.sprofile = sprofile;
		this.clickcount = clickcount;
		this.topiccount = topiccount;
	}
	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
