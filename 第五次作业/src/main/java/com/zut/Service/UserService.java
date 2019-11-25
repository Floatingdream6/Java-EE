package com.zut.Service;

import com.zut.Pojo.User;

import java.util.List;

/**
 * Created By 韩俊哲
 * on 2019/11/25 8:29
 */

public interface UserService {

    public List<User> findAll();

    public User findOne(int id);

    public List<User> findByName(String name);

    public int saveUser(User user);

    public int updateUser(User user);

    public List<User> findAllByLimit(int start ,int end);

    public User findAllOrders(int id);
}
