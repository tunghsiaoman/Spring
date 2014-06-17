package com.project.model;

import java.io.Serializable;

/**
 * 用户bean
 * @author Administrator
 * @since 2014-06-14
 */
public class Users implements Serializable {

	private static final long serialVersionUID = -3513489559468930948L;
	
	/** 用户id */ 
	private int uid;
	/** 用户名 */ 
	private String uname;
	/** 用户密码 */ 
	private String pwd;
	/** email */ 
	private String email;
	/** 性别 */ 
	private int sex;
	/** 等级 */ 
	private int clas;
	/** 备注 */ 
	private String remark;
	/** 注册时间 */ 
	private String regdate;
	/** 状态 */ 
	private int status;
	/** 积分 */ 
	private int point;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getClas() {
		return clas;
	}
	public void setClas(int clas) {
		this.clas = clas;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Users(int uid, String uname, String pwd, String email, int sex,
			int clas, String remark, String regdate, int status, int point) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pwd = pwd;
		this.email = email;
		this.sex = sex;
		this.clas = clas;
		this.remark = remark;
		this.regdate = regdate;
		this.status = status;
		this.point = point;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
