package com.zut.Dao;

import com.zut.Util.Boss;

/**
 * Created by 韩俊哲
 * on 2019/10/12
 */

public interface PersonDao {

    /**
     * 修改
     * @param boss
     */
    void ModifyPersonInfo(Boss boss);

    /**
     * 删除
     * @param name
     */
    void DeletePerson(String name);


    /**
     * 根据姓名查找用户
     * @param name
     * @return Boss
     */
    Boss SearchBossByName(String name);
}
