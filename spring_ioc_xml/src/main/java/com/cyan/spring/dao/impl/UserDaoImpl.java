package com.cyan.spring.dao.impl;

import com.cyan.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        System.out.println("保存成功！");
    }
}
