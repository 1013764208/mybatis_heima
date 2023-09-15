package com.heima.mapper;


import com.heima.pojp.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // （注解）在运行时，会自动生成该接口的实现对象（代理对象），并且该对象交给IOC容器
public interface UserMapper {


    @Select("select * from user")
    public List<User> list();
}
