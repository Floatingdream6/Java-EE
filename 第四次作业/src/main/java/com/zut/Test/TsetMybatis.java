package com.zut.Test;

import com.zut.Dao.AccountDao;
import com.zut.Utils.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TsetMybatis {

    public static void main(String[] args) throws Exception{

        /**
         *测试mybatis
         */
        InputStream in;
        in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sb.build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //查询所有
        List<Account> list = accountDao.findAll();
        for(Account a:list){
            System.out.println(a);
        }

        //增加
        /*Account account = new Account();
        account.setName("老姜");
        account.setMoney(222.2);
        accountDao.AddAccount(account);*/

        //删除
       /* accountDao.DeleteAccount(5);*/

        //修改
        /*Account account = accountDao.findOneAccount(4);
        account.setMoney(77);
        accountDao.UpdataAccount(account);*/
    }
}
