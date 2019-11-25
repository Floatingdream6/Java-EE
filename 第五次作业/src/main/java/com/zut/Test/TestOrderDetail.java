package com.zut.Test;

import com.zut.Pojo.OrderDetails;
import com.zut.Service.OderDetailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By 韩俊哲
 * on 2019/11/25 16:52
 */

public class TestOrderDetail {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OderDetailService oderDetailService = applicationContext.getBean("orderDetailServiceImpl",OderDetailService.class);

        OrderDetails orderDetails = oderDetailService.findOrderDetails(1);
        System.out.println(orderDetails);
    }
}
