package com.zut.Service.Impl;

import com.zut.Dao.OrdersDao;
import com.zut.Pojo.Orders;
import com.zut.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By 韩俊哲
 * on 2019/11/25 9:22
 */

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    public Orders findOrders(int id) {
        return ordersDao.findOrders(id);
    }

    public List<Orders> findAllOrders(int user_id){
        return  ordersDao.findAllOrders(user_id);
    }
}
