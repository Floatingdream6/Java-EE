package com.zut.Dao;

import com.zut.Pojo.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created By 韩俊哲
 * on 2019/11/25 16:45
 */

@Repository
public interface ItemsDao {

    @Select("select * from items where id = #{id}")
    public Items findItem(int id);
}
