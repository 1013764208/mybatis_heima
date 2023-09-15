package com.dao;

import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {


        // 1.获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {


            // 2.执行SQL (方式一 getMapper)
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }


        } catch (Exception e) {

        } finally {
            // 3.关闭SqlSession
            sqlSession.close();

        }


    }
}
