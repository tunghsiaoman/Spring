package com.project.model;

import java.io.Serializable;

/***
 * 跟帖bean
 * @author Administrator
 * @since 2014-06-14
 */
public class Reply implements Serializable  {

	private static final long serialVersionUID = -9119109321108149412L;
	
	/** 跟帖id */
	private int rid;
	/** 主贴id */
	private int rtid;
	/** 板块id */
	private int rsid;
	/** 用户id */
	private int ruid;
	/** 跟帖表情 */
	private int face;
	/** 跟帖内容 */
	private String contents;
	/** 跟帖时间 */
	private String backtime;
	/** 点击次数*/
	private int clickcount;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getRtid() {
		return rtid;
	}
	public void setRtid(int rtid) {
		this.rtid = rtid;
	}
	public int getRsid() {
		return rsid;
	}
	public void setRsid(int rsid) {
		this.rsid = rsid;
	}
	public int getRuid() {
		return ruid;
	}
	public void setRuid(int ruid) {
		this.ruid = ruid;
	}
	public int getFace() {
		return face;
	}
	public void setFace(int face) {
		this.face = face;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getBacktime() {
		return backtime;
	}
	public void setBacktime(String backtime) {
		this.backtime = backtime;
	}
	public int getClickcount() {
		return clickcount;
	}
	public void setClickcount(int clickcount) {
		this.clickcount = clickcount;
	}
	public Reply(int rid, int rtid, int rsid, int ruid, int face,
			String contents, String backtime, int clickcount) {
		super();
		this.rid = rid;
		this.rtid = rtid;
		this.rsid = rsid;
		this.ruid = ruid;
		this.face = face;
		this.contents = contents;
		this.backtime = backtime;
		this.clickcount = clickcount;
	}
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
