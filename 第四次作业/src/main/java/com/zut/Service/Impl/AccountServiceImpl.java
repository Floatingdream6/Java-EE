package com.zut.Service.Impl;

import com.zut.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountservice")
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int Transfer(Integer output, Integer input, Double money) {
        int i = jdbcTemplate.update("update account set money = money-? where id = ?",money,output);
        int j = jdbcTemplate.update("update account set money = money+? where id = ?",money,input);
        return i==j?1:-1;
    }
}
