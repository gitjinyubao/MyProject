package com.augmentum.oes.dao;

import org.springframework.stereotype.Repository;

import com.augmentum.oes.model.User;

@Repository
public interface UserDao {

    public User getUserByName(String userName);
}
