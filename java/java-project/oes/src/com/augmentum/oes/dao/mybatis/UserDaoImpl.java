package com.augmentum.oes.dao.mybatis;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.augmentum.oes.dao.UserDao;
import com.augmentum.oes.model.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    private static final String CLASS_NAME = User.class.getName();
    private static final String SQL_ID_USER__GET_USER_BY_NAME = ".getUserByName";

    @Override
    public User getUserByName(String userName) {
        return getSqlSession().selectOne(CLASS_NAME + SQL_ID_USER__GET_USER_BY_NAME, userName);
    }
}
