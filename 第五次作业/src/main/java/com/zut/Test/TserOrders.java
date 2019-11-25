package com.zut.Test;

import com.zut.Pojo.Orders;
import com.zut.Service.OrdersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By 韩俊哲
 * on 2019/11/25 9:23
 */

public class TserOrders {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrdersService ordersService = applicationContext.getBean("ordersServiceImpl",OrdersService.class);

        Orders orders = ordersService.findOrders(6);
        System.out.println(orders);
    }
}
