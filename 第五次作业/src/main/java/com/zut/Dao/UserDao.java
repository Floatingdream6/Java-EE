package com.zut.Dao;

import com.zut.Pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By 韩俊哲
 * on 2019/11/25 8:11
 */

@Repository
public interface UserDao {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id = #{id}")
    public User findOne(int id);

    @Select("select * from user where username like '%${value}%'")
    public List<User> findByName(String name);

    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    public int saveUser(User user);

    @Update("update user set username = #{username},birthday = #{birthday},sex = #{sex},address = #{address} where id = #{id}")
    public int updateUser(User user);

    @Select("select * from user limit #{start},#{end}")
    public List<User> findAllByLimit(@Param("start") int start , @Param("end") int end);

    /**
     * 根据用户id查询订单信息
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "birthday",property = "birthday"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "address",property = "address"),
            @Result(column = "id",property = "ordersList",
                    many = @Many(select = "com.zut.Dao.OrdersDao.findAllOrders",
                            fetchType = FetchType.LAZY))
    })
    public User findAllOrders(int id);
}
