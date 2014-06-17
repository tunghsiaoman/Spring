package com.project.dao;

import java.util.List;

import com.project.model.Section;
import com.project.model.Users;

/***
 * 板块信息DAO
 * @author Administrator
 * @since 2014-06-15
 */
public interface ISectionDAO {
	/*-----------------------query--------------------*/
	/** 查询所有板块 */
	List<Section> queryAllSection();
	
	/*-----------------------update--------------------*/
	/** 根据Users对象修改用户 */
	int updateSection(Section section);
	
	/** 根据用户id修改用户 */
	int updateSectionById(int sid);
	
	/*-----------------------insert--------------------*/
	/** 新增用户 */
	int insertSection(Section section);
	
	/*-----------------------delete--------------------*/
	/** 根据id删除用户 */
	int deleteSection(int sectionid);
}
