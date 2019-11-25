package com.zut.Service.Impl;

import com.zut.Dao.OrderDetilDao;
import com.zut.Pojo.OrderDetails;
import com.zut.Pojo.Orders;
import com.zut.Service.OderDetailService;
import com.zut.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By 韩俊哲
 * on 2019/11/25 16:50
 */

@Service
public class OrderDetailServiceImpl implements OderDetailService {

    @Autowired
    private OrderDetilDao orderDetilDao;

    public OrderDetails findOrderDetails(int id) {
        return orderDetilDao.findOrderDetails(id);
    }
}
