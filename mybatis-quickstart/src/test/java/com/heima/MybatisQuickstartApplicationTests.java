package com.heima;

import com.heima.mapper.UserMapper;
import com.heima.pojp.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest  // springBoot 整合单元测试的注解
class MybatisQuickstartApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();
        userList.forEach(user -> {
            System.out.println(user);
        });
    }
}
