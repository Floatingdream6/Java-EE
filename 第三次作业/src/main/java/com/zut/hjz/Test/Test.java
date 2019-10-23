package com.zut.hjz.Test;

import com.zut.hjz.Service.IcountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 韩俊哲
 * on 2019/10/21
 */

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        IcountService icountService = ac.getBean("accountservice",IcountService.class);
        icountService.saveacount();
    }
}
