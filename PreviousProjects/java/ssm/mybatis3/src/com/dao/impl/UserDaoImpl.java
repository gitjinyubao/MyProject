package com.dao.impl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dao.DBUtils;
import com.dao.UesrDao;
import com.entity.User;

public class UserDaoImpl implements UesrDao {

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		SqlSession  sqlSession=DBUtils.getSqlSession();
		List<User>   list=sqlSession.selectList("mapper.UserMapper.findAll");
		sqlSession.close();
		return   list;
	}

	@Override
	public User fibdOne(int id) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		User   user=sqlSession.selectOne("mapper.UserMapper.findOne", id);
		sqlSession.close();
		return user;
	}

	@Override
	public User fibdOne1(int id) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		User   user=sqlSession.selectOne("mapper.UserMapper.findOne1", id);
		sqlSession.close();
		return user;
	}

	@Override
	public User findOne2(int id) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		User   user=sqlSession.selectOne("mapper.UserMapper.findone2", id);
		sqlSession.close();
		return user;
	}

	@Override
	public List<User> findList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		List<User>   list=sqlSession.selectList("mapper.UserMapper.findlist", map);
		sqlSession.close();
		return list;
	}

	@Override
	public List<User> findList1(Map<String, Object> map) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		List<User>   list=sqlSession.selectList("mapper.UserMapper.Dong1FindList", map);
		sqlSession.close();
		return list;
	}

	@Override
	public List<User> findList2(Map<String, Object> map) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		List<User>   list=sqlSession.selectList("mapper.UserMapper.choosewhen", map);
		sqlSession.close();
		return list;
	}

	@Override
	public void update(Map<String, Object> map) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		sqlSession.selectList("mapper.UserMapper.update1", map);
		sqlSession.close();
	}

	@Override
	public List<User> findList3(List<Integer> list1) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession =DBUtils.getSqlSession();
		List<User> list=sqlSession.selectList("mapper.UserMapper.foreach", list1);
		sqlSession.close();
		return list;
		
	}

	
}
