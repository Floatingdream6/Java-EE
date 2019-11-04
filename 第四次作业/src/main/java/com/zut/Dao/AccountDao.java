package com.zut.Dao;

import com.zut.Utils.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void AddAccount(Account account);

    @Update("update account set name = #{name},money = #{money} where id = #{id}")
    public void UpdataAccount(Account account);

    @Delete("delete from account where id = #{id}")
    public void DeleteAccount(Integer id);

    @Select("select * from account where id = #{id}")
    public Account findOneAccount(Integer id);

}
