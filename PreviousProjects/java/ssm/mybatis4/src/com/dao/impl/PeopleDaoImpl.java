package com.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.dao.DBUtils;
import com.dao.PeopleDao;
import com.entity.Wife;
import com.entity.Huspand;

public class PeopleDaoImpl implements PeopleDao {
	@Override
	public Huspand findById(int id) {
		// TODO Auto-generated method stub
		SqlSession  session=DBUtils.getSqlSession();
        Huspand   huspand=session.selectOne("mapper.HuspandMapper.findById",id);
        session.close();
        return huspand;
	}

	@Override
	public Wife findById1(int id) {
		// TODO Auto-generated method stub
		SqlSession  session=DBUtils.getSqlSession();
        Wife   wife=session.selectOne("mapper.WifeMapper.findById1",id);
		return wife;
	}
}
