package com.zut.Service.Impl;

import com.zut.Service.MeettingSevice;
import com.zut.Util.Boss;
import com.zut.Util.Meetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * Created by 韩俊哲
 * on 2019/10/12
 */

@Service("meettingservice")
public class MeettingServiceImpl implements MeettingSevice {

    @Autowired
    private Meetting meetting;

    public void PrintSomeMessage() {
        System.out.println("会议主题："+meetting.getTheme());
        System.out.println("老板信息：");
        for(Boss b:meetting.getList()){
            System.out.println(b);
        }
    }
}
