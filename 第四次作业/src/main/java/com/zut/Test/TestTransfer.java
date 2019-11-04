package com.zut.Test;

import com.zut.Service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransfer {

    public static void main(String[] args) {
        /**
         * 银行转账
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountservice",AccountService.class);
        if(accountService.Transfer(1,2,23.0)==1){
            System.out.println("转账成功");
        }else {
            System.out.println("转账失败");
        }
    }
}
