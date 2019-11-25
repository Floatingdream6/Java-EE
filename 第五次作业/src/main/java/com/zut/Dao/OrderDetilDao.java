package com.zut.Dao;

import com.zut.Pojo.OrderDetails;
import com.zut.Pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

/**
 * Created By 韩俊哲
 * on 2019/11/25 16:38
 */

@Repository
public interface OrderDetilDao {


    /**
     * 根据订单编号查询用户信息和购买的商品信息
     *
     * @param id
     * @return
     */
    @Select("select * from orderdetail where id = #{id}")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "orders_id", property = "orders_id"),
            @Result(column = "items_id", property = "items_id"),
            @Result(column = "orders_id", property = "orders", one = @One(select = "com.zut.Dao.OrdersDao.findOrders", fetchType = FetchType.EAGER)),
            @Result(column = "items_id", property = "items",
                    one = @One(select = "com.zut.Dao.ItemsDao.findItem", fetchType = FetchType.EAGER
                    )
            )
    })
    public OrderDetails findOrderDetails(int id);



}
