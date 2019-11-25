package com.zut.Test;

import com.zut.Pojo.User;
import com.zut.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created By 韩俊哲
 * on 2019/11/25 8:31
 */

public class TestUser {
    public static void main(String[] args) throws ParseException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceImpl",UserService.class);
        User user = applicationContext.getBean("user",User.class);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        /*List<User> list = userService.findAll();
        for(User u:list){
            System.out.println(u);
        }*/

        /*List<User> list = userService.findByName("小");
        for(User u:list){
            System.out.println(u);
        }*/

        /*user = userService.findOne(46);
        System.out.println("修改前："+user);
        user.setAddress("中国河南省郑州市");
        user.setBirthday(dateFormat.parse("1998-08-22"));
        userService.updateUser(user);
        user = userService.findOne(46);
        System.out.println("修改后："+user);*/

        /*user.setUsername("张大大");
        user.setSex("男");
        user.setBirthday(dateFormat.parse("2008-12-12"));
        user.setAddress("火星");
        if(userService.saveUser(user)>0){
            System.out.println("保存成功");
        }*/


        /*List<User> list = userService.findAllByLimit(0,5);
        for(User u:list){
            System.out.println(u);
        }*/

        user = userService.findAllOrders(1);
        System.out.println(user);

    }
}
