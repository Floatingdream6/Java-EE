package com.zut.Test;

import com.zut.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 韩俊哲
 * on 2019/10/13
 */

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userserviceimpl", UserService.class);
        userService.say();
    }
}
