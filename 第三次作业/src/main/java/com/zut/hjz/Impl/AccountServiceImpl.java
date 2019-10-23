package com.zut.hjz.Impl;

import com.zut.hjz.Service.IcountService;
import org.springframework.stereotype.Service;

/**
 * Created by 韩俊哲
 * on 2019/10/11
 */

@Service("accountservice")
public class AccountServiceImpl implements IcountService {

    public void saveacount() {
        System.out.println("save account");
    }

}
