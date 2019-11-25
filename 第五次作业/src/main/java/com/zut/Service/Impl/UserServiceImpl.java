package com.zut.Service.Impl;

import com.zut.Dao.UserDao;
import com.zut.Pojo.Orders;
import com.zut.Pojo.User;
import com.zut.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By 韩俊哲
 * on 2019/11/25 8:32
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findOne(int id) {
        return userDao.findOne(id);
    }

    public List<User> findByName(String name) {
        return userDao.findByName(name);
    }

    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public List<User> findAllByLimit(int start ,int end){
        return userDao.findAllByLimit(start, end);
    }

    public User findAllOrders(int id){
        return userDao.findAllOrders(id);
    }
}
