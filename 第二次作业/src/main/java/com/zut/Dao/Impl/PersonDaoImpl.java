package com.zut.Dao.Impl;

import com.zut.Dao.PersonDao;
import com.zut.Util.Boss;
import com.zut.Util.Meetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 韩俊哲
 * on 2019/10/12
 */

@Service("persondaoimpl")
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private Meetting meetting;

    public void ModifyPersonInfo(Boss boss) {
        for (int i = 0; i < meetting.getList().size(); i++) {
            if (meetting.getList().get(i).getName().equals(boss.getName())) {
                meetting.getList().remove(i);
                meetting.getList().add(boss);
            }
        }

    }

    public void DeletePerson(String name) {
        for (int i = 0; i < meetting.getList().size(); i++) {
            if (meetting.getList().get(i).getName().equals(name)) {
                meetting.getList().remove(i);
            }

        }
    }

    public Boss SearchBossByName(String name) {
        for (int i = 0; i < meetting.getList().size(); i++) {
            if (meetting.getList().size() == i)
                break;
            if (meetting.getList().get(i).getName().equals(name)) {
                return meetting.getList().get(i);
            }

        }
        return null;
    }
}
