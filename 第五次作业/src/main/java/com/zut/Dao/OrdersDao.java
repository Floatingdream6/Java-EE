package com.zut.Dao;

import com.zut.Pojo.Orders;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By 韩俊哲
 * on 2019/11/25 9:17
 */

@Repository
public interface OrdersDao {

    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(id = true,column = "id",property="id"),
            @Result(column = "user_id", property = "user_id"),
            @Result(column = "number", property = "number"),
            @Result(column = "createtime",property = "createtime"),
            @Result(column = "note" , property = "note"),
            @Result(column = "user_id" , property = "user",one=@One(select = "com.zut.Dao.UserDao.findOne",fetchType = FetchType.EAGER))

    })
    public Orders findOrders(int id);

    @Select("select * from orders where user_id = #{user_id}")
    public List<Orders> findAllOrders(int user_id);
}
