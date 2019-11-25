package com.zut.Service;

import com.zut.Pojo.Orders;

import java.util.List;

/**
 * Created By 韩俊哲
 * on 2019/11/25 9:21
 */

public interface OrdersService {

    public Orders findOrders(int id);

    public List<Orders> findAllOrders(int user_id);
}
