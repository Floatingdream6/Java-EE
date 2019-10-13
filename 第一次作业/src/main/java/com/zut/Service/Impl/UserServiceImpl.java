package com.zut.Service.Impl;

import com.zut.Dao.UserDao;
import com.zut.Service.UserService;

/**
 * Created by 韩俊哲
 * on 2019/10/13
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        userDao.say();
        System.out.println("this is userservice");
    }
}
