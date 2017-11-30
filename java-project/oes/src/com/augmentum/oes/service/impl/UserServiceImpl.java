package com.augmentum.oes.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.augmentum.oes.dao.UserDao;
import com.augmentum.oes.exception.ParameterException;
import com.augmentum.oes.exception.ServiceException;
import com.augmentum.oes.model.User;
import com.augmentum.oes.service.UserService;
import com.augmentum.oes.util.StringUtil;
public class UserServiceImpl implements UserService{

    private Logger logger = Logger.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User login(String userName, String password) throws ParameterException, ServiceException {
        ParameterException paraException = new ParameterException();
        long currtime = System.currentTimeMillis();
        logger.info("currtime " + currtime);
        //check the userName and passowrd which are from front page
        if (StringUtil.isEmpty(userName)) {
            //map storage error message about userName
            paraException.addErrorMessage("userName", " username is required!");
        }

        if (StringUtil.isEmpty(password)) {
            //map storage error message about password
            paraException.addErrorMessage("password", " password is required!");
        }

        if(paraException.isFiledError()){
            throw paraException;
        }

        User user = userDao.getUserByName(userName);

        if(user == null){
            throw new ServiceException(1000, "* username does not exist !");
        }

        if(!user.getPassword().equals(password)){
            throw new ServiceException(1001, "* password is wrong !");
        }

        return user;
    }
}
